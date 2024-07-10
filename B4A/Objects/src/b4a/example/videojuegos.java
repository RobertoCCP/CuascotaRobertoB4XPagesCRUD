package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class videojuegos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.videojuegos");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.videojuegos.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4a.example.videojuegos __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="videojuegos";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.videojuegos __ref,int _id,String _nombre,String _genero,double _precio,int _tiendaid) throws Exception{
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_genero,_precio,_tiendaid}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_genero,_precio,_tiendaid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.videojuegos parent,b4a.example.videojuegos __ref,int _id,String _nombre,String _genero,double _precio,int _tiendaid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._genero = _genero;
this._precio = _precio;
this._tiendaid = _tiendaid;
this.__ref = parent;
}
b4a.example.videojuegos __ref;
b4a.example.videojuegos parent;
int _id;
String _nombre;
String _genero;
double _precio;
int _tiendaid;
b4a.example.videojuego _vid = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="videojuegos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim vid As Videojuego";
_vid = new b4a.example.videojuego();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="vid.Initialize()";
_vid._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ge";
_json = ("{\"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+", \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\", \"genero\": \""+parent.__c.SmartStringFormatter("",(Object)(_genero))+"\", \"precio\": "+parent.__c.SmartStringFormatter("",(Object)(_precio))+", \"tienda_onlineId\": "+parent.__c.SmartStringFormatter("",(Object)(_tiendaid))+"}");
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "videojuegos", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="vid.Id = data.Get(\"id\")";
_vid._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="vid.Nombre = data.Get(\"nombre\")";
_vid._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="vid.Genero = data.Get(\"genero\")";
_vid._genero /*String*/  = BA.ObjectToString(_data.Get((Object)("genero")));
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="vid.Precio = data.Get(\"precio\")";
_vid._precio /*double*/  = (double)(BA.ObjectToNumber(_data.Get((Object)("precio"))));
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="vid.TiendaId = data.Get(\"tienda_onlineId\")";
_vid._tiendaid /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("tienda_onlineId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="Return vid";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_vid));return;};
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.videojuegos __ref,int _id) throws Exception{
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.videojuegos parent,b4a.example.videojuegos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.videojuegos __ref;
b4a.example.videojuegos parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="videojuegos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "videojuegos", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.videojuegos __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.videojuegos __ref) throws Exception{
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.videojuegos parent,b4a.example.videojuegos __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.videojuegos __ref;
b4a.example.videojuegos parent;
anywheresoftware.b4a.objects.collections.List _clas = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
b4a.example.videojuego _vid = null;
int step11;
int limit11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="videojuegos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim clas As List";
_clas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="clas.Initialize";
_clas.Initialize();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "videojuegos", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="lst = jsonParser.NextArray";
_lst = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="For i = 0 To lst.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step11 = 1;
limit11 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="map = lst.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lst.Get(_i)));
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Dim vid As Videojuego";
_vid = new b4a.example.videojuego();
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="vid.Initialize";
_vid._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="vid.Id = map.Get(\"id\")";
_vid._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="vid.Nombre = map.Get(\"nombre\")";
_vid._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="vid.Genero = map.Get(\"genero\")";
_vid._genero /*String*/  = BA.ObjectToString(_map.Get((Object)("genero")));
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="vid.Precio = map.Get(\"precio\")";
_vid._precio /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("precio"))));
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="vid.TiendaId = map.Get(\"tienda_onlineId\")";
_vid._tiendaid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("tienda_onlineId"))));
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="clas.Add(vid)";
_clas.Add((Object)(_vid));
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
RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="Return clas";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_clas));return;};
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.videojuegos __ref,int _id) throws Exception{
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.videojuegos parent,b4a.example.videojuegos __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.videojuegos __ref;
b4a.example.videojuegos parent;
int _id;
b4a.example.videojuego _vid = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="videojuegos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim vid As Videojuego";
_vid = new b4a.example.videojuego();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="vid.Initialize";
_vid._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "videojuegos", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="If resultado.Success Then";
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
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="vid.Id = map.Get(\"id\")";
_vid._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="vid.Nombre = map.Get(\"nombre\")";
_vid._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="vid.Genero = map.Get(\"genero\")";
_vid._genero /*String*/  = BA.ObjectToString(_map.Get((Object)("genero")));
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="vid.Precio = map.Get(\"precio\")";
_vid._precio /*double*/  = (double)(BA.ObjectToNumber(_map.Get((Object)("precio"))));
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="vid.TiendaId = map.Get(\"tienda_onlineId\")";
_vid._tiendaid /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("tienda_onlineId"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="Return vid";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_vid));return;};
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.videojuegos __ref,int _id,String _nombre,String _genero,double _precio,int _tiendaid) throws Exception{
RDebugUtils.currentModule="videojuegos";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_genero,_precio,_tiendaid}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_genero,_precio,_tiendaid);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.videojuegos parent,b4a.example.videojuegos __ref,int _id,String _nombre,String _genero,double _precio,int _tiendaid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._genero = _genero;
this._precio = _precio;
this._tiendaid = _tiendaid;
this.__ref = parent;
}
b4a.example.videojuegos __ref;
b4a.example.videojuegos parent;
int _id;
String _nombre;
String _genero;
double _precio;
int _tiendaid;
b4a.example.videojuego _vid = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="videojuegos";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim vid As Videojuego";
_vid = new b4a.example.videojuego();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="vid.Initialize()";
_vid._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ge";
_json = ("{\"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+", \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\", \"genero\": \""+parent.__c.SmartStringFormatter("",(Object)(_genero))+"\", \"precio\": "+parent.__c.SmartStringFormatter("",(Object)(_precio))+", \"tienda_onlineId\": "+parent.__c.SmartStringFormatter("",(Object)(_tiendaid))+"}");
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "videojuegos", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}