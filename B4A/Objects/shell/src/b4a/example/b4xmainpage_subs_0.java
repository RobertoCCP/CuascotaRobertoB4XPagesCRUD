package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
RemoteObject _tiendaspage = RemoteObject.declareNull("b4a.example.b4xtiendas");
 BA.debugLineNum = 25;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Dim TiendasPage As B4XTiendas";
Debug.ShouldStop(33554432);
_tiendaspage = RemoteObject.createNew ("b4a.example.b4xtiendas");Debug.locals.put("TiendasPage", _tiendaspage);
 BA.debugLineNum = 27;BA.debugLine="TiendasPage.Initialize";
Debug.ShouldStop(67108864);
_tiendaspage.runClassMethod (b4a.example.b4xtiendas.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="B4XPages.AddPageAndCreate(\"TiendasPage\", TiendasP";
Debug.ShouldStop(268435456);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TiendasPage")),(Object)((_tiendaspage)));
 BA.debugLineNum = 31;BA.debugLine="B4XPages.ShowPage(\"TiendasPage\")";
Debug.ShouldStop(1073741824);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TiendasPage")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("button2_click")) { return __ref.runUserSub(false, "b4xmainpage","button2_click", __ref);}
RemoteObject _videojuegospage = RemoteObject.declareNull("b4a.example.b4xvideojuegos");
 BA.debugLineNum = 34;BA.debugLine="Private Sub Button2_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim VideojuegosPage As B4XVideojuegos";
Debug.ShouldStop(4);
_videojuegospage = RemoteObject.createNew ("b4a.example.b4xvideojuegos");Debug.locals.put("VideojuegosPage", _videojuegospage);
 BA.debugLineNum = 36;BA.debugLine="VideojuegosPage.Initialize";
Debug.ShouldStop(8);
_videojuegospage.runClassMethod (b4a.example.b4xvideojuegos.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="B4XPages.AddPageAndCreate(\"VideojuegosPage\", Vide";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("VideojuegosPage")),(Object)((_videojuegospage)));
 BA.debugLineNum = 40;BA.debugLine="B4XPages.ShowPage(\"VideojuegosPage\")";
Debug.ShouldStop(128);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("VideojuegosPage")));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}