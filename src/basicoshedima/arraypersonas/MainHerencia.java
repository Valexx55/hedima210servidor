package basicoshedima.arraypersonas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainHerencia {
	
	public static void main(String[] args) {
		
//		Alumno alumno = new Alumno(10);
//		Alumno alumno2 = new Alumno(3);
//		
//		System.out.println(alumno.getNota());
//		System.out.println(alumno2.getNota());
//		
//		System.out.println("Nombre " + alumno.getNombre());
//		System.out.println("Edad " +alumno.getEdad());
//		
		Alumno alumno3 = new Alumno(8, "Aleix", 19);
		
		if (alumno3 instanceof Object) {
			System.out.println("Alumno es un Object");
			System.out.println(alumno3.toString());
			
		}
		
		alumno3.toString();
		
//		System.out.println("Nota " +alumno3.getNota());
//		System.out.println("Nombre " + alumno3.getNombre());
//		System.out.println("Edad " +alumno3.getEdad());
//		
//		if (alumno3 instanceof Persona) {
//			System.out.println("Alumno es de tipo Persona");
//			//SUPERCASTING DEL SUBTIPO AL SUPERTIPO
//			Persona p = (Persona)alumno3; //casting de alumno a persona
//			System.out.println("Nombre persona = " +p.getNombre());
//			
//			//TODO HACER EL CASTIGN DE PERSONA A ALUJMNO
//			//INFRACASTING DEL SUPERTIPO AL SUBTIPO
//			Alumno a2 = (Alumno)p;
//			System.out.println("Nota = " + a2.getNota());
//			
//			
//		} else {
//			System.out.println("Alumno NO es de tipo Persona");
//		}
//		
//	
//		
		
//		List<Alumno> arrayList = null;//no se puede usar. sólo lo declaro
//		arrayList = new ArrayList<Alumno>();//instancio y ya se puede usar, ya riene memoria
//		arrayList.add(alumno4);
//		Alumno alumnonuevo = arrayList.get(0);
//		System.out.println(alumnonuevo.toString());
//		if (alumnonuevo.equals(alumno4))
//		{
//			System.out.println("Son iguales el 4 y el nuevo");
//		} else {
//			System.out.println("Son distintos");
//		}
//		Alumno alumno4 = new Alumno(8, "Aleix", 19);
//		Alumno alumno5 = new Alumno(8, "Aleix", 19);
//		if (alumno4.equals(alumno5))
//		{
//			System.out.println("Son iguales el 4 y el 5");
//		} else {
//			System.out.println("Son distintos");
//		}
		
		List<Persona> lp = new LinkedList<Persona>();
		CRUD objeto_crud = new Alumno(33);
		
		lp.add(new Persona());
		
		/**
		 * 
		 * 1) AÑADID UNA OPCIÓN AL PROGRAMA DE ARRAY PERSONAS QUE SEA
		 * SÓLO MOSTRAR ALUMNOS Y QUE MUESTRE SÓLO A LOS ALUMNOS QUE ESTÉN 
		 * EN A LISTA "mostrar alumnos"
		 * 
		 * 2) AÑADID UNA OPCIÓN AL PROGRAMA DE ARRAY PERSONAS QUE INFORME
		 * DEL NÚMERO DE ALUMNOS EN LA LISTA "informar num alumnos"
		 * 
		 * 3) HACED UN MÉTODO QUE RECIBA UNA LILSTA DE PERSONAS Y ME DUEVUELVA
		 * UNA SUBLISTA CON SÓLO LOS ALUMNOS DE LA LISTA DE PERSONAS
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
}
}
