B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public apiURL As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(url As String)
	apiURL = url
End Sub

Public Sub Create(id As Int, empresa As String) As ResumableSub
	Dim tie As Tienda
	Dim json As String
	Dim data As Map
	
	tie.Initialize()
	json = "{'id': 0, 'empresa': '"& empresa &"'}"
	
	apiJob.Initialize("",Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize( resultado.GetString)
		data = jsonParser.NextObject
		tie.Id = data.Get("id")
		tie.Empresa = data.Get("empresa")
	End If
	Return tie
End Sub

Public Sub Read_All() As ResumableSub
	Dim clas As List
	Dim tie As Tienda
	Dim map As Map
	Dim lst As List
	
	clas.Initialize
	tie.Initialize
	
	apiJob.Initialize("",Me)
	apiJob.Download(apiURL)
	Wait For(apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			Dim tie As Tienda
			tie.Initialize
			tie.Id = map.Get("id")
			tie.Empresa = map.Get("empresa")
			clas.Add(tie)
		Next
	End If
	
	Return clas
End Sub


Public Sub Read_ById(id As Int) As ResumableSub
	Dim tie As Tienda
	tie.Initialize
	
	apiJob.Initialize("",Me)
	apiJob.Download(apiURL &"/"& id)
	Wait For (apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		tie.Id = map.Get("id")
		tie.Empresa = map.Get("empresa")
	End If
	Return tie
End Sub

Public Sub Update (id As Int, empresa As String) As ResumableSub
	Dim tie As Tienda
	Dim json As String
	Dim data As Map
	
	tie.Initialize()
	json = "{'id': '"& id &"', 'empresa': '"& empresa &"'}"
	
	apiJob.Initialize("",Me)
	apiJob.PutString(apiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
	
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete (id As Int) As ResumableSub
	
	apiJob.Initialize("",Me)
	apiJob.Delete(apiURL & "/" & id)
	
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub