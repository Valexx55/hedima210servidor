package basicoshedima.arraypersonas;

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
		
		System.out.println("Nota " +alumno3.getNota());
		System.out.println("Nombre " + alumno3.getNombre());
		System.out.println("Edad " +alumno3.getEdad());
		
		if (alumno3 instanceof Persona) {
			System.out.println("Alumno es de tipo Persona");
			//SUPERCASTING DEL SUBTIPO AL SUPERTIPO
			Persona p = (Persona)alumno3; //casting de alumno a persona
			System.out.println("Nombre persona = " +p.getNombre());
			
			//TODO HACER EL CASTIGN DE PERSONA A ALUJMNO
			//INFRACASTING DEL SUPERTIPO AL SUBTIPO
			Alumno a2 = (Alumno)p;
			System.out.println("Nota = " + a2.getNota());
			
			
		} else {
			System.out.println("Alumno NO es de tipo Persona");
		}
		
	
		
	}

}
