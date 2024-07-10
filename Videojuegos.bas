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

Public Sub Create(id As Int, nombre As String, genero As String, precio As Double, tiendaId As Int) As ResumableSub
	Dim vid As Videojuego
	Dim json As String
	Dim data As Map
    
	vid.Initialize()
	json = $"{"id": ${id}, "nombre": "${nombre}", "genero": "${genero}", "precio": ${precio}, "tienda_onlineId": ${tiendaId}}"$
    
	apiJob.Initialize("", Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		vid.Id = data.Get("id")
		vid.Nombre = data.Get("nombre")
		vid.Genero = data.Get("genero")
		vid.Precio = data.Get("precio")
		vid.TiendaId = data.Get("tienda_onlineId")
	End If
	Return vid
End Sub

Public Sub Read_All() As ResumableSub
	Dim clas As List
	Dim map As Map
	Dim lst As List
    
	clas.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL)
	Wait For(apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lst = jsonParser.NextArray
		For i = 0 To lst.Size - 1
			map = lst.Get(i)
			Dim vid As Videojuego
			vid.Initialize
			vid.Id = map.Get("id")
			vid.Nombre = map.Get("nombre")
			vid.Genero = map.Get("genero")
			vid.Precio = map.Get("precio")
			vid.TiendaId = map.Get("tienda_onlineId")
			clas.Add(vid)
		Next
	End If
	Return clas
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	Dim vid As Videojuego
	vid.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL & "/" & id)
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		vid.Id = map.Get("id")
		vid.Nombre = map.Get("nombre")
		vid.Genero = map.Get("genero")
		vid.Precio = map.Get("precio")
		vid.TiendaId = map.Get("tienda_onlineId")
	End If
	Return vid
End Sub

Public Sub Update(id As Int, nombre As String, genero As String, precio As Double, tiendaId As Int) As ResumableSub
	Dim vid As Videojuego
	Dim json As String
    
	vid.Initialize()
	json = $"{"id": ${id}, "nombre": "${nombre}", "genero": "${genero}", "precio": ${precio}, "tienda_onlineId": ${tiendaId}}"$
    
	apiJob.Initialize("", Me)
	apiJob.PutString(apiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
	apiJob.Initialize("", Me)
	apiJob.Delete(apiURL & "/" & id)
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub
