package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xvideojuegos_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xvideojuegos","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"VideojuegosPage\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("VideojuegosPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="apiClas.Initialize(\"https://utncloudcomputingapiv";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Videojuegos")));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xvideojuegos._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xvideojuegos._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xvideojuegos._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xvideojuegos._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xvideojuegos._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xvideojuegos._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
b4xvideojuegos._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",b4xvideojuegos._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtGenero As EditText";
b4xvideojuegos._txtgenero = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtgenero",b4xvideojuegos._txtgenero);
 //BA.debugLineNum = 7;BA.debugLine="Private txtPrecio As EditText";
b4xvideojuegos._txtprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtprecio",b4xvideojuegos._txtprecio);
 //BA.debugLineNum = 8;BA.debugLine="Private txtTiendaId As EditText";
b4xvideojuegos._txttiendaid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttiendaid",b4xvideojuegos._txttiendaid);
 //BA.debugLineNum = 9;BA.debugLine="Private apiClas As Videojuegos";
b4xvideojuegos._apiclas = RemoteObject.createNew ("b4a.example.videojuegos");__ref.setField("_apiclas",b4xvideojuegos._apiclas);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdcreate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("cmdcreate_click")) { __ref.runUserSub(false, "b4xvideojuegos","cmdcreate_click", __ref); return;}
ResumableSub_cmdCreate_Click rsub = new ResumableSub_cmdCreate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdCreate_Click extends BA.ResumableSub {
public ResumableSub_cmdCreate_Click(b4a.example.b4xvideojuegos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xvideojuegos parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.videojuego");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,43);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 44;BA.debugLine="Wait For (apiClas.Create(0, txtNombre.Text, txtGe";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmdcreate_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtgenero" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtprecio" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttiendaid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 45;BA.debugLine="If c.Id > 0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 46;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
Debug.ShouldStop(16384);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Insertado el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 49;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
Debug.ShouldStop(65536);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _c) throws Exception{
}
public static void  _cmddelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("cmddelete_click")) { __ref.runUserSub(false, "b4xvideojuegos","cmddelete_click", __ref); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.b4xvideojuegos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xvideojuegos parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.videojuego");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,74);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 75;BA.debugLine="If txtId.Text = \"\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 76;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor ingresa un ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 80;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmddelete_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 17;
return;
case 17:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 81;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 5:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 15;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 83;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmddelete_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 84;BA.debugLine="If success Then";
Debug.ShouldStop(524288);
if (true) break;

case 8:
//if
this.state = 13;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 86;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 87;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 88;BA.debugLine="txtGenero.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtgenero" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 89;BA.debugLine="txtPrecio.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtprecio" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 90;BA.debugLine="txtTiendaId.Text = \"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txttiendaid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 92;BA.debugLine="Msgbox(\"No se pudo borrar el registro\", \"Error\"";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo borrar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Ingresa un ID válido")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdleer_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("cmdleer_click")) { __ref.runUserSub(false, "b4xvideojuegos","cmdleer_click", __ref); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xvideojuegos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xvideojuegos parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.videojuego");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,24);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 25;BA.debugLine="If txtId.Text = \"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 26;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor ingresa un ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 30;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmdleer_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 31;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 32;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="txtNombre.Text = r.Nombre";
Debug.ShouldStop(1);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="txtGenero.Text = r.Genero";
Debug.ShouldStop(2);
__ref.getField(false,"_txtgenero" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_genero" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="txtPrecio.Text = r.Precio";
Debug.ShouldStop(4);
__ref.getField(false,"_txtprecio" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_precio" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="txtTiendaId.Text = r.TiendaId";
Debug.ShouldStop(8);
__ref.getField(false,"_txttiendaid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_tiendaid" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 38;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Ingresa un ID válido")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _cmdupdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("cmdupdate_click")) { __ref.runUserSub(false, "b4xvideojuegos","cmdupdate_click", __ref); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.b4xvideojuegos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xvideojuegos parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.videojuego");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,53);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 54;BA.debugLine="If txtId.Text = \"\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 55;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor ingresa un ID")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 56;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 59;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmdupdate_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 17;
return;
case 17:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 60;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 15;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 62;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtNombre.T";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xvideojuegos", "cmdupdate_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.videojuegos.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtgenero" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(BA.numberCast(double.class, __ref.getField(false,"_txtprecio" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_txttiendaid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 63;BA.debugLine="If success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 8:
//if
this.state = 13;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 66;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Er";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo actualizar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
Debug.ShouldStop(16);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Ingresa un ID válido")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cmdvolvermenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdVolverMenu_Click (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("cmdvolvermenu_click")) { return __ref.runUserSub(false, "b4xvideojuegos","cmdvolvermenu_click", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Private Sub cmdVolverMenu_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(8);
b4xvideojuegos._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xvideojuegos) ","b4xvideojuegos",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xvideojuegos","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}