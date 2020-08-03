package basicoshedima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PrincipalMapas {
	
	private static void mostrarMapa (Map<String, Usuario> mapa)
	{
		//lOS CONJUNTOS A NIVEL PRÁCTICO SE USAN SÓLO PARA RECORRER MAPAS
		//un conjunto es una colección que no tiene elementos repetidos
		Set<String> conjunto_claves = mapa.keySet();//COJO LAS CLAVES
		//yo voy recorriendo las claves y por cada clave, obtengo el valor del mapa asociado
		Iterator<String> iterator = conjunto_claves.iterator();//VOY RECORRIENDO LAS CLAVES
		String clave_actual = null;
		Usuario usuario_aux = null;
		while (iterator.hasNext())
		{
			clave_actual = iterator.next();
			System.out.println("Clave = "+clave_actual);
			usuario_aux = mapa.get(clave_actual);
			System.out.println(usuario_aux);
		}
	}
	
	public static void main(String[] args) {
		//creo el mapa
		//Map<String, Usuario> mu = new HashMap<String, Usuario>();
		//Map<String, Usuario> mu = new TreeMap<String, Usuario>();
		Map<String, Usuario> mu = new LinkedHashMap<String, Usuario>();
		
		Usuario usuario = new Usuario(3, "vale", "valeri");
		Usuario usuario2 = new Usuario(2, "pedro", "pedrito");
		Usuario usuario3 = new Usuario(1, "yoel", "yole");
		Usuario usuario4 = new Usuario(4, "elo", "rivas");
		
		mu.put(usuario.getNombre(), usuario);
		mu.put(usuario2.getNombre(), usuario2);
		mu.put(usuario3.getNombre(), usuario3);
		mu.put(usuario4.getNombre(), usuario4);
		
		mostrarMapa (mu);
		
	}

	
	/** RECORRIDO CON HASHMAP --EL ORDEN ES DESCONOCIDO-
	 * Clave = vale
ID = 3 NOMBRE = vale PASS valeri
Clave = pedro
ID = 2 NOMBRE = pedro PASS pedrito
Clave = yoel
ID = 1 NOMBRE = yoel PASS yole
Clave = elo
ID = 4 NOMBRE = elo PASS rivas
	 */
	
	/**RECORRIDO CON EL TREEMAP -EL ORDEN ES POR LA CLAVE-
	 * Clave = elo
ID = 4 NOMBRE = elo PASS rivas
Clave = pedro
ID = 2 NOMBRE = pedro PASS pedrito
Clave = vale
ID = 3 NOMBRE = vale PASS valeri
Clave = yoel
ID = 1 NOMBRE = yoel PASS yole
	 */
	
	/** RECORRIDO CON LINKEDHASHMAP - EL ORDEN ES EL DE INSERCIÓN-
	 * Clave = vale
ID = 3 NOMBRE = vale PASS valeri
Clave = pedro
ID = 2 NOMBRE = pedro PASS pedrito
Clave = yoel
ID = 1 NOMBRE = yoel PASS yole
Clave = elo
ID = 4 NOMBRE = elo PASS rivas
	 */
}
