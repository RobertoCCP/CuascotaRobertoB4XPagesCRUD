package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tiendas_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private jsonParser As JSONParser";
tiendas._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",tiendas._jsonparser);
 //BA.debugLineNum = 3;BA.debugLine="Private apiJob As HttpJob";
tiendas._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",tiendas._apijob);
 //BA.debugLineNum = 4;BA.debugLine="Public apiURL As String";
tiendas._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",tiendas._apiurl);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _empresa) throws Exception{
try {
		Debug.PushSubsStack("Create (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "tiendas","create", __ref, _id, _empresa);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_empresa);
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
public ResumableSub_Create(b4a.example.tiendas parent,RemoteObject __ref,RemoteObject _id,RemoteObject _empresa) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._empresa = _empresa;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tiendas parent;
RemoteObject _id;
RemoteObject _empresa;
RemoteObject _tie = RemoteObject.declareNull("b4a.example.tienda");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,12);
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
Debug.locals.put("empresa", _empresa);
 BA.debugLineNum = 13;BA.debugLine="Dim tie As Tienda";
Debug.ShouldStop(4096);
_tie = RemoteObject.createNew ("b4a.example.tienda");Debug.locals.put("tie", _tie);
 BA.debugLineNum = 14;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 15;BA.debugLine="Dim data As Map";
Debug.ShouldStop(16384);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 17;BA.debugLine="tie.Initialize()";
Debug.ShouldStop(65536);
_tie.runClassMethod (b4a.example.tienda.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="json = \"{'id': 0, 'empresa': '\"& empresa &\"'}\"";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': 0, 'empresa': '"),_empresa,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 20;BA.debugLine="apiJob.Initialize(\"\",Me)";
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
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tiendas", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
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
 BA.debugLineNum = 25;BA.debugLine="jsonParser.Initialize( resultado.GetString)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(33554432);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 27;BA.debugLine="tie.Id = data.Get(\"id\")";
Debug.ShouldStop(67108864);
_tie.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 28;BA.debugLine="tie.Empresa = data.Get(\"empresa\")";
Debug.ShouldStop(134217728);
_tie.setField ("_empresa" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empresa"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 30;BA.debugLine="Return tie";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_tie));return;};
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Delete (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "tiendas","delete", __ref, _id);}
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
public ResumableSub_Delete(b4a.example.tiendas parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tiendas parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,94);
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
 BA.debugLineNum = 96;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 97;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(1);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 99;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tiendas", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 100;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "tiendas","initialize", __ref, _ba, _url);}
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
		Debug.PushSubsStack("Read_All (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "tiendas","read_all", __ref);}
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
public ResumableSub_Read_All(b4a.example.tiendas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tiendas parent;
RemoteObject _clas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tie = RemoteObject.declareNull("b4a.example.tienda");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,33);
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
 BA.debugLineNum = 34;BA.debugLine="Dim clas As List";
Debug.ShouldStop(2);
_clas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("clas", _clas);
 BA.debugLineNum = 35;BA.debugLine="Dim tie As Tienda";
Debug.ShouldStop(4);
_tie = RemoteObject.createNew ("b4a.example.tienda");Debug.locals.put("tie", _tie);
 BA.debugLineNum = 36;BA.debugLine="Dim map As Map";
Debug.ShouldStop(8);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 37;BA.debugLine="Dim lst As List";
Debug.ShouldStop(16);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 39;BA.debugLine="clas.Initialize";
Debug.ShouldStop(64);
_clas.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="tie.Initialize";
Debug.ShouldStop(128);
_tie.runClassMethod (b4a.example.tienda.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 42;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(512);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 43;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tiendas", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 45;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 46;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(8192);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="lst = jsonParser.NextArray";
Debug.ShouldStop(16384);
_lst = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 48;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 49;BA.debugLine="map = lst.Get(i)";
Debug.ShouldStop(65536);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 50;BA.debugLine="Dim tie As Tienda";
Debug.ShouldStop(131072);
_tie = RemoteObject.createNew ("b4a.example.tienda");Debug.locals.put("tie", _tie);
 BA.debugLineNum = 51;BA.debugLine="tie.Initialize";
Debug.ShouldStop(262144);
_tie.runClassMethod (b4a.example.tienda.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 52;BA.debugLine="tie.Id = map.Get(\"id\")";
Debug.ShouldStop(524288);
_tie.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 53;BA.debugLine="tie.Empresa = map.Get(\"empresa\")";
Debug.ShouldStop(1048576);
_tie.setField ("_empresa" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empresa"))))));
 BA.debugLineNum = 54;BA.debugLine="clas.Add(tie)";
Debug.ShouldStop(2097152);
_clas.runVoidMethod ("Add",(Object)((_tie)));
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
 BA.debugLineNum = 58;BA.debugLine="Return clas";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_clas));return;};
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Read_ById (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "tiendas","read_byid", __ref, _id);}
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
public ResumableSub_Read_ById(b4a.example.tiendas parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tiendas parent;
RemoteObject _id;
RemoteObject _tie = RemoteObject.declareNull("b4a.example.tienda");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,62);
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
 BA.debugLineNum = 63;BA.debugLine="Dim tie As Tienda";
Debug.ShouldStop(1073741824);
_tie = RemoteObject.createNew ("b4a.example.tienda");Debug.locals.put("tie", _tie);
 BA.debugLineNum = 64;BA.debugLine="tie.Initialize";
Debug.ShouldStop(-2147483648);
_tie.runClassMethod (b4a.example.tienda.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 66;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(2);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 67;BA.debugLine="apiJob.Download(apiURL &\"/\"& id)";
Debug.ShouldStop(4);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 68;BA.debugLine="Wait For (apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tiendas", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 69;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 70;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(32);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 72;BA.debugLine="tie.Id = map.Get(\"id\")";
Debug.ShouldStop(128);
_tie.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 73;BA.debugLine="tie.Empresa = map.Get(\"empresa\")";
Debug.ShouldStop(256);
_tie.setField ("_empresa" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("empresa"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="Return tie";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_tie));return;};
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _empresa) throws Exception{
try {
		Debug.PushSubsStack("Update (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "tiendas","update", __ref, _id, _empresa);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_empresa);
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
public ResumableSub_Update(b4a.example.tiendas parent,RemoteObject __ref,RemoteObject _id,RemoteObject _empresa) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._empresa = _empresa;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.tiendas parent;
RemoteObject _id;
RemoteObject _empresa;
RemoteObject _tie = RemoteObject.declareNull("b4a.example.tienda");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (tiendas) ","tiendas",3,__ref.getField(false, "ba"),__ref,78);
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
Debug.locals.put("empresa", _empresa);
 BA.debugLineNum = 79;BA.debugLine="Dim tie As Tienda";
Debug.ShouldStop(16384);
_tie = RemoteObject.createNew ("b4a.example.tienda");Debug.locals.put("tie", _tie);
 BA.debugLineNum = 80;BA.debugLine="Dim json As String";
Debug.ShouldStop(32768);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 81;BA.debugLine="Dim data As Map";
Debug.ShouldStop(65536);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 83;BA.debugLine="tie.Initialize()";
Debug.ShouldStop(262144);
_tie.runClassMethod (b4a.example.tienda.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 84;BA.debugLine="json = \"{'id': '\"& id &\"', 'empresa': '\"& empresa";
Debug.ShouldStop(524288);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'id': '"),_id,RemoteObject.createImmutable("', 'empresa': '"),_empresa,RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 86;BA.debugLine="apiJob.Initialize(\"\",Me)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 87;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 88;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 90;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "tiendas", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 91;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
}