package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xtiendas_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xtiendas","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"TiendasPage\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("TiendasPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="apiClas.Initialize(\"https://utncloudcomputingapiv";
Debug.ShouldStop(131072);
__ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.tiendas.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Tiendas_online")));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
b4xtiendas._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xtiendas._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xtiendas._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xtiendas._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
b4xtiendas._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",b4xtiendas._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtTienda_Online As EditText";
b4xtiendas._txttienda_online = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttienda_online",b4xtiendas._txttienda_online);
 //BA.debugLineNum = 6;BA.debugLine="Private apiClas As Tiendas";
b4xtiendas._apiclas = RemoteObject.createNew ("b4a.example.tiendas");__ref.setField("_apiclas",b4xtiendas._apiclas);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _cmdcreate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("cmdcreate_click")) { __ref.runUserSub(false, "b4xtiendas","cmdcreate_click", __ref); return;}
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
public ResumableSub_cmdCreate_Click(b4a.example.b4xtiendas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xtiendas parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.tienda");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdCreate_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 39;BA.debugLine="Wait For (apiClas.Create(0, txtTienda_Online.Text";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtiendas", "cmdcreate_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.tiendas.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txttienda_online" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 40;BA.debugLine="If c.Id > 0 Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 41;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(256);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Insertado el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 44;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
Debug.ShouldStop(2048);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo insertar el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("cmdDelete_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("cmddelete_click")) { __ref.runUserSub(false, "b4xtiendas","cmddelete_click", __ref); return;}
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
public ResumableSub_cmdDelete_Click(b4a.example.b4xtiendas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xtiendas parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdDelete_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,62);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 63;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, ingrese un ID.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 65;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 68;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtiendas", "cmddelete_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.tiendas.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 69;BA.debugLine="If r Then";
Debug.ShouldStop(16);
if (true) break;

case 5:
//if
this.state = 10;
if (_r.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 70;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Borrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 71;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="txtTienda_Online.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txttienda_online" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 74;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos o ID no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("cmdLeer_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("cmdleer_click")) { __ref.runUserSub(false, "b4xtiendas","cmdleer_click", __ref); return;}
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
public ResumableSub_cmdLeer_Click(b4a.example.b4xtiendas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xtiendas parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.tienda");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdLeer_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,23);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 24;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 25;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, ingrese un ID.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 29;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtiendas", "cmdleer_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.tiendas.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 30;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 31;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="txtTienda_Online.Text = r.Empresa";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txttienda_online" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_empresa" /*RemoteObject*/ )));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 34;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos o ID no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("cmdUpdate_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("cmdupdate_click")) { __ref.runUserSub(false, "b4xtiendas","cmdupdate_click", __ref); return;}
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
public ResumableSub_cmdUpdate_Click(b4a.example.b4xtiendas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.b4xtiendas parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cmdUpdate_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,48);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 49;BA.debugLine="If txtId.Text.Trim = \"\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Por favor, ingrese un ID.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 51;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 54;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtTienda_On";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xtiendas", "cmdupdate_click"), __ref.getField(false,"_apiclas" /*RemoteObject*/ ).runClassMethod (b4a.example.tiendas.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txttienda_online" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 55;BA.debugLine="If r Then";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 10;
if (_r.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 56;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos o ID no válido.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("cmdVolverMenu_Click (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("cmdvolvermenu_click")) { return __ref.runUserSub(false, "b4xtiendas","cmdvolvermenu_click", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Private Sub cmdVolverMenu_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(16384);
b4xtiendas._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Initialize (b4xtiendas) ","b4xtiendas",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xtiendas","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}