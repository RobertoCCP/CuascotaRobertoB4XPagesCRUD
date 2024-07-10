package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tiendas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.tiendas");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tiendas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _class_globals(b4a.example.tiendas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tiendas";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.tiendas __ref,int _id,String _empresa) throws Exception{
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_empresa}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_empresa);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.tiendas parent,b4a.example.tiendas __ref,int _id,String _empresa) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._empresa = _empresa;
this.__ref = parent;
}
b4a.example.tiendas __ref;
b4a.example.tiendas parent;
int _id;
String _empresa;
b4a.example.tienda _tie = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tiendas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim tie As Tienda";
_tie = new b4a.example.tienda();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="tie.Initialize()";
_tie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="json = \"{'id': 0, 'empresa': '\"& empresa &\"'}\"";
_json = "{'id': 0, 'empresa': '"+_empresa+"'}";
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tiendas", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="jsonParser.Initialize( resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="tie.Id = data.Get(\"id\")";
_tie._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="tie.Empresa = data.Get(\"empresa\")";
_tie._empresa /*String*/  = BA.ObjectToString(_data.Get((Object)("empresa")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="Return tie";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tie));return;};
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.tiendas __ref,int _id) throws Exception{
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.tiendas parent,b4a.example.tiendas __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.tiendas __ref;
b4a.example.tiendas parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tiendas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tiendas", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.tiendas __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.tiendas __ref) throws Exception{
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.tiendas parent,b4a.example.tiendas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.tiendas __ref;
b4a.example.tiendas parent;
anywheresoftware.b4a.objects.collections.List _clas = null;
b4a.example.tienda _tie = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tiendas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim clas As List";
_clas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim tie As Tienda";
_tie = new b4a.example.tienda();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="clas.Initialize";
_clas.Initialize();
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="tie.Initialize";
_tie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tiendas", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1245198;
 //BA.debugLineNum = 1245198;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=1245201;
 //BA.debugLineNum = 1245201;BA.debugLine="Dim tie As Tienda";
_tie = new b4a.example.tienda();
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="tie.Initialize";
_tie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="tie.Id = map.Get(\"id\")";
_tie._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=1245204;
 //BA.debugLineNum = 1245204;BA.debugLine="tie.Empresa = map.Get(\"empresa\")";
_tie._empresa /*String*/  = BA.ObjectToString(_map.Get((Object)("empresa")));
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="clas.Add(tie)";
_clas.Add((Object)(_tie));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="Return clas";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clas));return;};
RDebugUtils.currentLine=1245210;
 //BA.debugLineNum = 1245210;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.tiendas __ref,int _id) throws Exception{
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.tiendas parent,b4a.example.tiendas __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.tiendas __ref;
b4a.example.tiendas parent;
int _id;
b4a.example.tienda _tie = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tiendas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim tie As Tienda";
_tie = new b4a.example.tienda();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="tie.Initialize";
_tie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="apiJob.Download(apiURL &\"/\"& id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tiendas", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="tie.Id = map.Get(\"id\")";
_tie._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="tie.Empresa = map.Get(\"empresa\")";
_tie._empresa /*String*/  = BA.ObjectToString(_map.Get((Object)("empresa")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Return tie";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_tie));return;};
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.tiendas __ref,int _id,String _empresa) throws Exception{
RDebugUtils.currentModule="tiendas";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_empresa}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_empresa);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.tiendas parent,b4a.example.tiendas __ref,int _id,String _empresa) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._empresa = _empresa;
this.__ref = parent;
}
b4a.example.tiendas __ref;
b4a.example.tiendas parent;
int _id;
String _empresa;
b4a.example.tienda _tie = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tiendas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim tie As Tienda";
_tie = new b4a.example.tienda();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="tie.Initialize()";
_tie._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="json = \"{'id': '\"& id &\"', 'empresa': '\"& empresa";
_json = "{'id': '"+BA.NumberToString(_id)+"', 'empresa': '"+_empresa+"'}";
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="apiJob.Initialize(\"\",Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tiendas", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}