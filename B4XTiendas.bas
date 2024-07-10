B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private txtTienda_Online As EditText
	Private apiClas As Tiendas
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("TiendasPage")
	apiClas.Initialize("https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Tiendas_online")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub cmdLeer_Click
	If txtId.Text.Trim = "" Then
		Msgbox("Por favor, ingrese un ID.", "Error")
		Return
	End If
    
	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Tienda)
	If r.Id > 0 Then
		txtId.Text = r.Id
		txtTienda_Online.Text = r.Empresa
	Else
		Msgbox("No hay datos o ID no válido.", "Error")
	End If
End Sub

Private Sub cmdCreate_Click
	Wait For (apiClas.Create(0, txtTienda_Online.Text)) Complete (c As Tienda)
	If c.Id > 0 Then
		txtId.Text = c.Id
		Msgbox("Insertado el registro", "OK")
	Else
		Msgbox("No se pudo insertar el registro", "OK")
	End If
End Sub

Private Sub cmdUpdate_Click
	If txtId.Text.Trim = "" Then
		Msgbox("Por favor, ingrese un ID.", "Error")
		Return
	End If
    
	Wait For (apiClas.Update(txtId.Text, txtTienda_Online.Text)) Complete (r As Boolean)
	If r Then
		Msgbox("Registro Actualizado", "OK")
	Else
		Msgbox("No hay datos o ID no válido.", "Error")
	End If
End Sub

Private Sub cmdDelete_Click
	If txtId.Text.Trim = "" Then
		Msgbox("Por favor, ingrese un ID.", "Error")
		Return
	End If
    
	Wait For (apiClas.Delete(txtId.Text)) Complete (r As Boolean)
	If r Then
		Msgbox("Registro Borrado", "OK")
		txtId.Text = ""
		txtTienda_Online.Text = ""
	Else
		Msgbox("No hay datos o ID no válido.", "Error")
	End If
End Sub

Private Sub cmdVolverMenu_Click
	B4XPages.ShowPage("MainPage")
End Sub
