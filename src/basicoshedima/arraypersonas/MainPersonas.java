package basicoshedima.arraypersonas;

public class MainPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] array_personas = null;//declaro un variable tipo array de personas
		array_personas = new Persona[5];//instancio el array (caben 5 personas, pero tengo el array vacío)
		
		Persona p1 = null;//declaro una varible de tipo persona 
		p1 = new Persona(23, "PEPE");//instancio una persona
		
		
		array_personas[0] = p1;//meto a la persona p1 en la primera posición del array
		
		System.out.println(array_personas[0].getEdad());//imprimo la edad de la primera persona del array
		System.out.println(array_personas[0].getNombre());//imprimo el nombre de la primera persona del array
		
		array_personas = null; //Vacío el array
		
		System.exit(0);//fuerzo que el programa se acabe
		
		
		
		

	}

}
