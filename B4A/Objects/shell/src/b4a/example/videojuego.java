
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class videojuego {
    public static RemoteObject myClass;
	public videojuego() {
	}
    public static PCBA staticBA = new PCBA(null, videojuego.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable(0);
public static RemoteObject _nombre = RemoteObject.createImmutable("");
public static RemoteObject _genero = RemoteObject.createImmutable("");
public static RemoteObject _precio = RemoteObject.createImmutable(0);
public static RemoteObject _tiendaid = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.b4xpages _b4xpages = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Genero",_ref.getField(false, "_genero"),"Id",_ref.getField(false, "_id"),"Nombre",_ref.getField(false, "_nombre"),"Precio",_ref.getField(false, "_precio"),"TiendaId",_ref.getField(false, "_tiendaid")};
}
}