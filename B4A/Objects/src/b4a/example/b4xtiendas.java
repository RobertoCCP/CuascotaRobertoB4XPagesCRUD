package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xtiendas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xtiendas");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xtiendas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txttienda_online = null;
public b4a.example.tiendas _apiclas = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.b4xtiendas __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.b4xtiendas __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Root.LoadLayout(\"TiendasPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("TiendasPage",ba);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="apiClas.Initialize(\"https://utncloudcomputingapiv";
__ref._apiclas /*b4a.example.tiendas*/ ._initialize /*String*/ (null,ba,"https://utncloudcomputingapivideojuegos.azurewebsites.net/api/Tiendas_online");
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xtiendas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtiendas";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Private txtTienda_Online As EditText";
_txttienda_online = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Private apiClas As Tiendas";
_apiclas = new b4a.example.tiendas();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public void  _cmdcreate_click(b4a.example.b4xtiendas __ref) throws Exception{
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "cmdcreate_click", false))
	 {Debug.delegate(ba, "cmdcreate_click", null); return;}
ResumableSub_cmdCreate_Click rsub = new ResumableSub_cmdCreate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdCreate_Click extends BA.ResumableSub {
public ResumableSub_cmdCreate_Click(b4a.example.b4xtiendas parent,b4a.example.b4xtiendas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xtiendas __ref;
b4a.example.b4xtiendas parent;
b4a.example.tienda _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtiendas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Wait For (apiClas.Create(0, txtTienda_Online.Text";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtiendas", "cmdcreate_click"), __ref._apiclas /*b4a.example.tiendas*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txttienda_online /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.tienda) result[1];
;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If c.Id > 0 Then";
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
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Msgbox(\"Insertado el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Insertado el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Msgbox(\"No se pudo insertar el registro\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo insertar el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmddelete_click(b4a.example.b4xtiendas __ref) throws Exception{
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "cmddelete_click", false))
	 {Debug.delegate(ba, "cmddelete_click", null); return;}
ResumableSub_cmdDelete_Click rsub = new ResumableSub_cmdDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdDelete_Click extends BA.ResumableSub {
public ResumableSub_cmdDelete_Click(b4a.example.b4xtiendas parent,b4a.example.b4xtiendas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xtiendas __ref;
b4a.example.b4xtiendas parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtiendas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Wait For (apiClas.Delete(txtId.Text)) Complete (r";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtiendas", "cmddelete_click"), __ref._apiclas /*b4a.example.tiendas*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="If r Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_r) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Msgbox(\"Registro Borrado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Borrado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="txtTienda_Online.Text = \"\"";
__ref._txttienda_online /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos o ID no válido."),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdleer_click(b4a.example.b4xtiendas __ref) throws Exception{
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "cmdleer_click", false))
	 {Debug.delegate(ba, "cmdleer_click", null); return;}
ResumableSub_cmdLeer_Click rsub = new ResumableSub_cmdLeer_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdLeer_Click extends BA.ResumableSub {
public ResumableSub_cmdLeer_Click(b4a.example.b4xtiendas parent,b4a.example.b4xtiendas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xtiendas __ref;
b4a.example.b4xtiendas parent;
b4a.example.tienda _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtiendas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Wait For (apiClas.Read_ById(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtiendas", "cmdleer_click"), __ref._apiclas /*b4a.example.tiendas*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (b4a.example.tienda) result[1];
;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="If r.Id > 0 Then";
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
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="txtId.Text = r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="txtTienda_Online.Text = r.Empresa";
__ref._txttienda_online /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._empresa /*String*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos o ID no válido."),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cmdupdate_click(b4a.example.b4xtiendas __ref) throws Exception{
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "cmdupdate_click", false))
	 {Debug.delegate(ba, "cmdupdate_click", null); return;}
ResumableSub_cmdUpdate_Click rsub = new ResumableSub_cmdUpdate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cmdUpdate_Click extends BA.ResumableSub {
public ResumableSub_cmdUpdate_Click(b4a.example.b4xtiendas parent,b4a.example.b4xtiendas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.b4xtiendas __ref;
b4a.example.b4xtiendas parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtiendas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If txtId.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Msgbox(\"Por favor, ingrese un ID.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Por favor, ingrese un ID."),BA.ObjectToCharSequence("Error"),ba);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Wait For (apiClas.Update(txtId.Text, txtTienda_On";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtiendas", "cmdupdate_click"), __ref._apiclas /*b4a.example.tiendas*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txttienda_online /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 11;
return;
case 11:
//C
this.state = 5;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="If r Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_r) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="Msgbox(\"No hay datos o ID no válido.\", \"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos o ID no válido."),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cmdvolvermenu_click(b4a.example.b4xtiendas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtiendas";
if (Debug.shouldDelegate(ba, "cmdvolvermenu_click", false))
	 {return ((String) Debug.delegate(ba, "cmdvolvermenu_click", null));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub cmdVolverMenu_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
}