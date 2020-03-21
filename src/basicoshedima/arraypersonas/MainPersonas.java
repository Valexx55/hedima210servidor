package basicoshedima.arraypersonas;

/**
 * 1. MOSTRAR EL MENÚ. ok. ¿Cuántas veces? --> Hasta que no dé a salir. Mínimo 1
 * --> do while 2. Habrá que leer la opción introducida por el usuario -->
 * hacemos función : leerOpcion 3. En función de la opción, habrá que hacer
 * distintas cosas --> if () --> como son muchos, pega un swith case 4. Tendré
 * que declarar el array de personas.
 * 
 * @author vale
 *
 */

public class MainPersonas {

	/**
	 * LOS MÉTODOS PUEDEN SER PUBLIC O PRIVATE si son public, es que pueden
	 * invocarse desde dentro y desde fuera de la Clase donde están definidos si son
	 * private, es que sólo pueden invocarse desde dentro de la Clase donde están
	 * definidos
	 * 
	 * Cuando toque definir si un método es público o privado, habrá que tener más
	 * criterio e información.
	 * 
	 * De momento, todos los métodos que defináis dentro de esta clase Main, que
	 * sean private static
	 * 
	 * private y Static! (ya vimos lo que significaba static como modificador de
	 * atributos. En métodos aún no,
	 * 
	 * así que acto de fé, de momento. Todos private y static. Opcional hacer
	 * métodos, por supu.
	 */
	private static void mostrarMenu() {

		System.out.println("1. CREAR UN ARRAY DE PERSONAS");
		System.out.println("2. INSERTAR UNA NUEVA PERSONA EN EL ARRAY");
		System.out.println("3. MOSTRAR LAS PERSONAS QUE HAY EN EL ARRAY");
		System.out.println("4. MOSTRAR EL NOMBRE Y LA EDAD DE A LA PERSONA DE MAYOR EDAD");
		System.out.println("5. VACIAR EL ARRAY");
		System.out.println("6. BORRAR A UNA PERSONA DEL ARRAY POR SU NOMBRE");
		System.out.println("7 SALIR.");
		System.out.println("");// para que nos deje un salto en blanco
		System.out.println("Introduzca opción \n");// lo de \n es imprimir un Intro (equivale a la línea anterior)
	}

	private static int leerOpcion() {
		int opcion_introducida = 0;

		// TODO Leer de teclado lo que introduce el usario y pasarlo a número. Vamos a
		// suponer que siempre introduce un número

		return opcion_introducida;
	}

	public static void main(String[] args) {

		// 4 declaro el array
		Persona[] array_personas = null;

		// Lo primero que habrá que hacer es mostrar El menú. Esto lo podemos hacer en
		// el main,
		// o hacer una función aparte y llamarla. (leer indicaciones) //o poner todos
		// los sysos en el main, como está más abajo
		// mostrarMenu();

		// 1 bucle
		int opcion = 0;

		do {

			System.out.println("1. CREAR UN ARRAY DE PERSONAS");
			System.out.println("2. INSERTAR UNA NUEVA PERSONA EN EL ARRAY");
			System.out.println("3. MOSTRAR LAS PERSONAS QUE HAY EN EL ARRAY");
			System.out.println("4. MOSTRAR EL NOMBRE Y LA EDAD DE A LA PERSONA DE MAYOR EDAD");
			System.out.println("5. VACIAR EL ARRAY");
			System.out.println("6. BORRAR A UNA PERSONA DEL ARRAY POR SU NOMBRE");
			System.out.println("7. SALIR.");
			System.out.println("");// para que nos deje un salto en blanco
			System.out.println("Introduzca opción \n");// lo de \n es imprimir un Intro (equivale a la línea anterior)
			// 2 leerOpcion
			opcion = leerOpcion();
			// 3 casos: hacemos los caminos para cada elección del usuario
			switch (opcion) {
			case 1:
				System.out.println("Quiere crear el array");

				break;
			//TODO continuar con el resto de casos e ir haciendo dentro de cada case, lo que toca! case 2, 3, ...
			default:
				break;
			}

		} while (opcion != 7);
	}
	/**
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Persona[] array_personas = null;//declaro un variable tipo array de personas
	 * array_personas = new Persona[5];//instancio el array (caben 5 personas, pero
	 * tengo el array vacío)
	 * 
	 * Persona p1 = null;//declaro una varible de tipo persona p1 = new Persona(23,
	 * "PEPE");//instancio una persona
	 * 
	 * 
	 * array_personas[0] = p1;//meto a la persona p1 en la primera posición del
	 * array
	 * 
	 * System.out.println(array_personas[0].getEdad());//imprimo la edad de la
	 * primera persona del array
	 * System.out.println(array_personas[0].getNombre());//imprimo el nombre de la
	 * primera persona del array
	 * 
	 * array_personas = null; //Vacío el array
	 * 
	 * System.exit(0);//fuerzo que el programa se acabe
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
