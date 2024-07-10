package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class videojuegos_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
videojuegos._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",videojuegos._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
videojuegos._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",videojuegos._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
videojuegos._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",videojuegos._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _genero,RemoteObject _precio,RemoteObject _tiendaid) throws Exception{
try {
		Debug.PushSubsStack("Create (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "videojuegos","create", __ref, _id, _nombre, _genero, _precio, _tiendaid);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_genero,_precio,_tiendaid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.videojuegos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _genero,RemoteObject _precio,RemoteObject _tiendaid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._genero = _genero;
this._precio = _precio;
this._tiendaid = _tiendaid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.videojuegos parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _genero;
RemoteObject _precio;
RemoteObject _tiendaid;
RemoteObject _vid = RemoteObject.declareNull("b4a.example.videojuego");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,12);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("genero", _genero);
Debug.locals.put("precio", _precio);
Debug.locals.put("tiendaId", _tiendaid);
 BA.debugLineNum = 13;BA.debugLine="Dim vid As Videojuego";
Debug.ShouldStop(4096);
_vid = RemoteObject.createNew ("b4a.example.videojuego");Debug.locals.put("vid", _vid);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="vid.Initialize()";
Debug.ShouldStop(65536);
_vid.runClassMethod (b4a.example.videojuego.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ge";
Debug.ShouldStop(131072);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(", \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\", \"genero\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_genero))),RemoteObject.createImmutable("\", \"precio\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_precio))),RemoteObject.createImmutable(", \"tienda_onlineId\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tiendaid))),RemoteObject.createImmutable("}")));Debug.locals.put("json", _json);
 BA.debugLineNum = 20;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(524288);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 21;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 22;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 23;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "videojuegos", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 24;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 25;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(33554432);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 27;BA.debugLine="vid.Id = data.Get(\"id\")";
Debug.ShouldStop(67108864);
_vid.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 28;BA.debugLine="vid.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(134217728);
_vid.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 29;BA.debugLine="vid.Genero = data.Get(\"genero\")";
Debug.ShouldStop(268435456);
_vid.setField ("_genero" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("genero"))))));
 BA.debugLineNum = 30;BA.debugLine="vid.Precio = data.Get(\"precio\")";
Debug.ShouldStop(536870912);
_vid.setField ("_precio" /*RemoteObject*/ ,BA.numberCast(double.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio"))))));
 BA.debugLineNum = 31;BA.debugLine="vid.TiendaId = data.Get(\"tienda_onlineId\")";
Debug.ShouldStop(1073741824);
_vid.setField ("_tiendaid" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tienda_onlineId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 33;BA.debugLine="Return vid";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_vid));return;};
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "videojuegos","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.videojuegos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.videojuegos parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 99;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 100;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(8);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 102;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "videojuegos", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 103;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "videojuegos","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="apiURL = url";
Debug.ShouldStop(256);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "videojuegos","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.videojuegos parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.videojuegos parent;
RemoteObject _clas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
RemoteObject _vid = RemoteObject.declareNull("b4a.example.videojuego");
int step11;
int limit11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="Dim clas As List";
Debug.ShouldStop(16);
_clas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("clas", _clas);
 BA.debugLineNum = 38;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 39;BA.debugLine="Dim lst As List";
Debug.ShouldStop(64);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 41;BA.debugLine="clas.Initialize";
Debug.ShouldStop(256);
_clas.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 44;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(2048);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "videojuegos", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 46;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 47;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(16384);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(32768);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 49;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//for
this.state = 7;
step11 = 1;
limit11 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 50;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(131072);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 51;BA.debugLine="Dim vid As Videojuego";
Debug.ShouldStop(262144);
_vid = RemoteObject.createNew ("b4a.example.videojuego");Debug.locals.put("vid", _vid);
 BA.debugLineNum = 52;BA.debugLine="vid.Initialize";
Debug.ShouldStop(524288);
_vid.runClassMethod (b4a.example.videojuego.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 53;BA.debugLine="vid.Id = map.Get(\"id\")";
Debug.ShouldStop(1048576);
_vid.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 54;BA.debugLine="vid.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(2097152);
_vid.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 55;BA.debugLine="vid.Genero = map.Get(\"genero\")";
Debug.ShouldStop(4194304);
_vid.setField ("_genero" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("genero"))))));
 BA.debugLineNum = 56;BA.debugLine="vid.Precio = map.Get(\"precio\")";
Debug.ShouldStop(8388608);
_vid.setField ("_precio" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio"))))));
 BA.debugLineNum = 57;BA.debugLine="vid.TiendaId = map.Get(\"tienda_onlineId\")";
Debug.ShouldStop(16777216);
_vid.setField ("_tiendaid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tienda_onlineId"))))));
 BA.debugLineNum = 58;BA.debugLine="clas.Add(vid)";
Debug.ShouldStop(33554432);
_clas.runVoidMethod ("Add",(Object)((_vid)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 61;BA.debugLine="Return clas";
Debug.ShouldStop(268435456);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clas));return;};
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "videojuegos","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.videojuegos parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.videojuegos parent;
RemoteObject _id;
RemoteObject _vid = RemoteObject.declareNull("b4a.example.videojuego");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 65;BA.debugLine="Dim vid As Videojuego";
Debug.ShouldStop(1);
_vid = RemoteObject.createNew ("b4a.example.videojuego");Debug.locals.put("vid", _vid);
 BA.debugLineNum = 66;BA.debugLine="vid.Initialize";
Debug.ShouldStop(2);
_vid.runClassMethod (b4a.example.videojuego.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 68;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(8);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 69;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
Debug.ShouldStop(16);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 70;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "videojuegos", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 71;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 72;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(128);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(256);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 74;BA.debugLine="vid.Id = map.Get(\"id\")";
Debug.ShouldStop(512);
_vid.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 75;BA.debugLine="vid.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(1024);
_vid.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 76;BA.debugLine="vid.Genero = map.Get(\"genero\")";
Debug.ShouldStop(2048);
_vid.setField ("_genero" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("genero"))))));
 BA.debugLineNum = 77;BA.debugLine="vid.Precio = map.Get(\"precio\")";
Debug.ShouldStop(4096);
_vid.setField ("_precio" /*RemoteObject*/ ,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("precio"))))));
 BA.debugLineNum = 78;BA.debugLine="vid.TiendaId = map.Get(\"tienda_onlineId\")";
Debug.ShouldStop(8192);
_vid.setField ("_tiendaid" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tienda_onlineId"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="Return vid";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_vid));return;};
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _genero,RemoteObject _precio,RemoteObject _tiendaid) throws Exception{
try {
		Debug.PushSubsStack("Update (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "videojuegos","update", __ref, _id, _nombre, _genero, _precio, _tiendaid);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_genero,_precio,_tiendaid);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.videojuegos parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _genero,RemoteObject _precio,RemoteObject _tiendaid) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._genero = _genero;
this._precio = _precio;
this._tiendaid = _tiendaid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.videojuegos parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _genero;
RemoteObject _precio;
RemoteObject _tiendaid;
RemoteObject _vid = RemoteObject.declareNull("b4a.example.videojuego");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (videojuegos) ","videojuegos",6,__ref.getField(false, "ba"),__ref,83);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("genero", _genero);
Debug.locals.put("precio", _precio);
Debug.locals.put("tiendaId", _tiendaid);
 BA.debugLineNum = 84;BA.debugLine="Dim vid As Videojuego";
Debug.ShouldStop(524288);
_vid = RemoteObject.createNew ("b4a.example.videojuego");Debug.locals.put("vid", _vid);
 BA.debugLineNum = 85;BA.debugLine="Dim json As String";
Debug.ShouldStop(1048576);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 87;BA.debugLine="vid.Initialize()";
Debug.ShouldStop(4194304);
_vid.runClassMethod (b4a.example.videojuego.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 88;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ge";
Debug.ShouldStop(8388608);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(", \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\", \"genero\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_genero))),RemoteObject.createImmutable("\", \"precio\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_precio))),RemoteObject.createImmutable(", \"tienda_onlineId\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tiendaid))),RemoteObject.createImmutable("}")));Debug.locals.put("json", _json);
 BA.debugLineNum = 90;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 91;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 92;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(134217728);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 94;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "videojuegos", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 95;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
}