package basicoshedima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import basicoshedima.arraypersonas.Alumno;

public class MainOrdenar {

	
	public static void main(String[] args) {
		
//		List<String> lista_palabras = null;
//		lista_palabras = new ArrayList<String>();
//		
//		lista_palabras.add("SONIA");
//		lista_palabras.add("PEDRO");
//		lista_palabras.add("YOEL");
//		lista_palabras.add("HUMBERTO");
//		lista_palabras.add("VALE");
//		
//		System.out.println(" Lista según orden de inserción " +lista_palabras);
//		
//		Collections.sort(lista_palabras);
//		System.out.println(" Lista ordenada = " + lista_palabras);
		
		Alumno alumno1 = new Alumno(10, "YOEL", 25);
		Alumno alumno2 = new Alumno(5, "PEDRO", 25);
		Alumno alumno3 = new Alumno(7, "SONIA", 25);
		Alumno alumno4 = new Alumno(6, "HUMBERTO", 25);
		
		List<Alumno> lista_alumnos = null;
		lista_alumnos = new ArrayList<Alumno>();
		lista_alumnos.add(alumno1);
		lista_alumnos.add(alumno2);
		lista_alumnos.add(alumno3);
		lista_alumnos.add(alumno4);
		
		System.out.println("Lista alumnos " + lista_alumnos);
		Collections.sort(lista_alumnos);
		System.out.println("Lista alumnos ORDENADA " + lista_alumnos);
		
		
		
		
		
		
		
		
		
		
	}
}
