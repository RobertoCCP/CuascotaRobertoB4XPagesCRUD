package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xvideojuegos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xvideojuegos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xvideojuegos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtgenero = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtprecio = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttiendaid = null;
public b4a.example.videojuegos _apiclas = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.b4xvideojuegos __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xvideojuegos __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Root.LoadLayout(\"VideojuegosPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("VideojuegosPage",ba);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="apiClas.Initialize(\"https://utncloudcomputingapiv";
__ref._apiclas /*b4a.example.videojuegos*/ ._initialize /*String*/ (null,ba,"https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Videojuegos");
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xvideojuegos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideojuegos";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Private txtGenero As EditText";
_txtgenero = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="Private txtPrecio As EditText";
_txtprecio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Private txtTiendaId As EditText";
_txttiendaid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Private apiClas As Videojuegos";
_apiclas = new b4a.example.videojuegos();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="End Sub";
return "";
}
public void  _cmdcreate_click(b4a.example.b4xvideojuegos __ref) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "cmdcreate_click", false))
	 {Debug.delegate(ba, "cmdcreate_click", null); return;}
ResumableSub_cmdCreate_Click rsub = new ResumableSub_cmdCreate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCreate_Click extends BA.ResumableSub {
public ResumableSub_cmdCreate_Click(b4a.example.b4xvideojuegos parent,b4a.example.b4xvideojuegos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xvideojuegos __ref;
b4a.example.b4xvideojuegos parent;
b4a.example.videojuego _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Wait For (apiClas.Create(0, txtNombre.Text, txtGe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmdcreate_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtgenero /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(double)(Double.parseDouble(__ref._txtprecio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txttiendaid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.videojuego) result[1];
;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="If c.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_c._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmddelete_click(b4a.example.b4xvideojuegos __ref) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "cmddelete_click", false))
	 {Debug.delegate(ba, "cmddelete_click", null); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.b4xvideojuegos parent,b4a.example.b4xvideojuegos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xvideojuegos __ref;
b4a.example.b4xvideojuegos parent;
b4a.example.videojuego _r = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If txtId.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor ingresa un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmddelete_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 17;
return;
case 17:
//C
this.state = 5;
_r = (b4a.example.videojuego) result[1];
;
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 16;
if (_r._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 15;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmddelete_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="If success Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_success) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Borrado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="txtGenero.Text = \"\"";
__ref._txtgenero /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="txtPrecio.Text = \"\"";
__ref._txtprecio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="txtTiendaId.Text = \"\"";
__ref._txttiendaid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="Msgbox(\"No se pudo borrar el registro\", \"Error\"";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo borrar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Ingresa un ID válido"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdleer_click(b4a.example.b4xvideojuegos __ref) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "cmdleer_click", false))
	 {Debug.delegate(ba, "cmdleer_click", null); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xvideojuegos parent,b4a.example.b4xvideojuegos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xvideojuegos __ref;
b4a.example.b4xvideojuegos parent;
b4a.example.videojuego _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If txtId.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor ingresa un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmdleer_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (b4a.example.videojuego) result[1];
;
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_r._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="txtId.Text = r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="txtNombre.Text = r.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._nombre /*String*/ ));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="txtGenero.Text = r.Genero";
__ref._txtgenero /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._genero /*String*/ ));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="txtPrecio.Text = r.Precio";
__ref._txtprecio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._precio /*double*/ ));
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="txtTiendaId.Text = r.TiendaId";
__ref._txttiendaid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._tiendaid /*int*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Ingresa un ID válido"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdupdate_click(b4a.example.b4xvideojuegos __ref) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "cmdupdate_click", false))
	 {Debug.delegate(ba, "cmdupdate_click", null); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.b4xvideojuegos parent,b4a.example.b4xvideojuegos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xvideojuegos __ref;
b4a.example.b4xvideojuegos parent;
b4a.example.videojuego _r = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xvideojuegos";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="If txtId.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Msgbox(\"Por favor ingresa un ID\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor ingresa un ID"),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmdupdate_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 17;
return;
case 17:
//C
this.state = 5;
_r = (b4a.example.videojuego) result[1];
;
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 5:
//if
this.state = 16;
if (_r._id /*int*/ >0) { 
this.state = 7;
}else {
this.state = 15;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtNombre.T";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xvideojuegos", "cmdupdate_click"), __ref._apiclas /*b4a.example.videojuegos*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtgenero /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),(double)(Double.parseDouble(__ref._txtprecio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),(int)(Double.parseDouble(__ref._txttiendaid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 18;
return;
case 18:
//C
this.state = 8;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="If success Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_success) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Msgbox(\"No se pudo actualizar el registro\", \"Er";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo actualizar el registro"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Msgbox(\"Ingresa un ID válido\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Ingresa un ID válido"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=2949138;
 //BA.debugLineNum = 2949138;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdvolvermenu_click(b4a.example.b4xvideojuegos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideojuegos";
if (Debug.shouldDelegate(ba, "cmdvolvermenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdvolvermenu_click", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub cmdVolverMenu_Click";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
}