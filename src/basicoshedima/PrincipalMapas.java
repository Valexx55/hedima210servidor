package basicoshedima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PrincipalMapas {
	
	private static void mostrarMapa (Map<Integer, Usuario> mapa)
	{
		//lOS CONJUNTOS A NIVEL PRÁCTICO SE USAN SÓLO PARA RECORRER MAPAS
		//un conjunto es una colección que no tiene elementos repetidos
		Set<Integer> conjunto_claves = mapa.keySet();//COJO LAS CLAVES
		//yo voy recorriendo las claves y por cada clave, obtengo el valor del mapa asociado
		Iterator<Integer> iterator = conjunto_claves.iterator();//VOY RECORRIENDO LAS CLAVES
		int clave_actual = 0;
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
		Map<Integer, Usuario> mu = new HashMap<Integer, Usuario>();
		
		Usuario usuario = new Usuario(3, "vale", "valeri");
		Usuario usuario2 = new Usuario(2, "pedro", "pedrito");
		Usuario usuario3 = new Usuario(1, "yoel", "yole");
		Usuario usuario4 = new Usuario(4, "elo", "rivas");
		
		mu.put(usuario.getId(), usuario);
		mu.put(usuario2.getId(), usuario2);
		mu.put(usuario3.getId(), usuario3);
		mu.put(usuario4.getId(), usuario4);
		
		mostrarMapa (mu);
		
	}

}
