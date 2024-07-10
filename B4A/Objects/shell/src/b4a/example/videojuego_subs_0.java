package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class videojuego_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Id As Int";
videojuego._id = RemoteObject.createImmutable(0);__ref.setField("_id",videojuego._id);
 //BA.debugLineNum = 3;BA.debugLine="Public Nombre As String";
videojuego._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",videojuego._nombre);
 //BA.debugLineNum = 4;BA.debugLine="Public Genero As String";
videojuego._genero = RemoteObject.createImmutable("");__ref.setField("_genero",videojuego._genero);
 //BA.debugLineNum = 5;BA.debugLine="Public Precio As Double";
videojuego._precio = RemoteObject.createImmutable(0);__ref.setField("_precio",videojuego._precio);
 //BA.debugLineNum = 6;BA.debugLine="Public TiendaId As Int";
videojuego._tiendaid = RemoteObject.createImmutable(0);__ref.setField("_tiendaid",videojuego._tiendaid);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (videojuego) ","videojuego",5,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "videojuego","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}