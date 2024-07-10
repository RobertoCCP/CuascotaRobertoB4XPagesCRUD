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
	Private txtNombre As EditText
	Private txtGenero As EditText
	Private txtPrecio As EditText
	Private txtTiendaId As EditText
	Private apiClas As Videojuegos
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("VideojuegosPage")
	apiClas.Initialize("https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Videojuegos")
End Sub

Private Sub cmdLeer_Click
	If txtId.Text = "" Then
		Msgbox("Por favor ingresa un ID", "Error")
		Return
	End If

	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Videojuego)
	If r.Id > 0 Then
		txtId.Text = r.Id
		txtNombre.Text = r.Nombre
		txtGenero.Text = r.Genero
		txtPrecio.Text = r.Precio
		txtTiendaId.Text = r.TiendaId
	Else
		Msgbox("Ingresa un ID válido", "Error")
	End If
End Sub


Private Sub cmdCreate_Click
	Wait For (apiClas.Create(0, txtNombre.Text, txtGenero.Text, txtPrecio.Text, txtTiendaId.Text)) Complete (c As Videojuego)
	If c.Id > 0 Then
		txtId.Text = c.Id
		Msgbox("Insertado el registro", "OK")
	Else
		Msgbox("No se pudo insertar el registro", "OK")
	End If
End Sub

Private Sub cmdUpdate_Click
	If txtId.Text = "" Then
		Msgbox("Por favor ingresa un ID", "Error")
		Return
	End If

	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Videojuego)
	If r.Id > 0 Then
		' Realizar la actualización
		Wait For (apiClas.Update(txtId.Text, txtNombre.Text, txtGenero.Text, txtPrecio.Text, txtTiendaId.Text)) Complete (success As Boolean)
		If success Then
			Msgbox("Registro Actualizado", "OK")
		Else
			Msgbox("No se pudo actualizar el registro", "Error")
		End If
	Else
		Msgbox("Ingresa un ID válido", "Error")
	End If
End Sub


Private Sub cmdDelete_Click
	If txtId.Text = "" Then
		Msgbox("Por favor ingresa un ID", "Error")
		Return
	End If

	Wait For (apiClas.Read_ById(txtId.Text)) Complete (r As Videojuego)
	If r.Id > 0 Then
		' Realizar la eliminación
		Wait For (apiClas.Delete(txtId.Text)) Complete (success As Boolean)
		If success Then
			Msgbox("Registro Borrado", "OK")
			txtId.Text = ""
			txtNombre.Text = ""
			txtGenero.Text = ""
			txtPrecio.Text = ""
			txtTiendaId.Text = ""
		Else
			Msgbox("No se pudo borrar el registro", "Error")
		End If
	Else
		Msgbox("Ingresa un ID válido", "Error")
	End If
End Sub

Private Sub cmdVolverMenu_Click
	B4XPages.ShowPage("MainPage")
End Sub
