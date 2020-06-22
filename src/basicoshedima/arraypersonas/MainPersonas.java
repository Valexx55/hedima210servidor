package basicoshedima.arraypersonas;

import java.util.Scanner;

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
//TODO --> Hacer una nueva opci�n que permita insertar ALUMNOS!

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

	/**
	 * Método que imprime por pantalla el menú. Ni recibe ni devuelve nada (no
	 * produce ningún cálculo, sólo muestra, ni necesita ningún dato de entrada para
	 * llevar a cabo su tarea)
	 */
	private static void mostrarMenu() {

		System.out.println("1. CREAR UN ARRAY DE PERSONAS");
		System.out.println("2. INSERTAR UNA NUEVA PERSONA EN EL ARRAY");
		System.out.println("3. INSERTAR UN NUEVO ALUMNO EN EL ARRAY");
		System.out.println("4. MOSTRAR LAS PERSONAS QUE HAY EN EL ARRAY");
		System.out.println("5. MOSTRAR EL NOMBRE Y LA EDAD DE A LA PERSONA DE MAYOR EDAD");
		System.out.println("6. VACIAR EL ARRAY");
		System.out.println("7. BORRAR A UNA PERSONA DEL ARRAY POR SU NOMBRE");
		System.out.println("8. SALIR.");
		System.out.println("");// para que nos deje un salto en blanco
		System.out.println("Introduzca opción: ");// lo de \n es imprimir un Intro (equivale a la línea anterior)
	}

	/**
	 * Método que lee la opción introducida por teclado
	 * 
	 * @return el número leído
	 */
	private static int leerOpcion() {
		int opcion_introducida = 0;
		Scanner scanner = null;// variable que necesito para leer de teclado

		scanner = new Scanner(System.in);//
		opcion_introducida = scanner.nextInt();// suponemos que introduce un número. no valildamos! (si mete una letra
												// petaría y el programa acabaría de forma abrupta)

		return opcion_introducida;
	}

	/**
	 * Método que pide los datos que constituyen una persona por teclado (nombre y
	 * edad)
	 * 
	 * @return la persona con los datos introducidos
	 */
	private static Persona obtenerPersona() {
		Persona persona = null; // devuelvo una persona, así que primera línea, una variable del tipo devuelto
		Scanner scanner = null; // para leer de teclado
		int edad = 0; // variable auxiliar para alamcenar temporalmente la edad leída por teclado
		String nombre = null;// ídem, para el nombre

		scanner = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		edad = scanner.nextInt();

		System.out.println("Introduzca nombre: ");
		nombre = scanner.next();

		persona = new Persona(edad, nombre);// creamos una persona con los datos introducidos

		return persona;// última, un return de la primera

	}
	
	private static Alumno obtenerAlumno() {
		Alumno alumno = null; // devuelvo una persona, así que primera línea, una variable del tipo devuelto
		Scanner scanner = null; // para leer de teclado
		int edad = 0; // variable auxiliar para alamcenar temporalmente la edad leída por teclado
		String nombre = null;// ídem, para el nombre
		int nota = 0;
		
		scanner = new Scanner(System.in);
		System.out.println("Introduzca edad: ");
		edad = scanner.nextInt();

		System.out.println("Introduzca nombre: ");
		nombre = scanner.next();
		
		System.out.println("Introduzca nota: ");
		nota = scanner.nextInt();

		alumno = new Alumno(nota, nombre, edad);// creamos una persona con los datos introducidos

		return alumno;// última, un return de la primera

	}
	
	private static String pedirNombreABuscar ()
	{
		Scanner scanner = null; // para leer de teclado
		String nombre = null; 
		
			System.out.println("Introduzca nombre: ");
			scanner = new Scanner(System.in);
			nombre = scanner.next();
			
		return nombre;
	}
	
	private static int buscarPosicionMayoEdad (Persona[] array_personas)
	{
		int pos_mayor = 0;
		
		return pos_mayor;
	}

	public static void main(String[] args) {

		// 4 declaro el array
		Persona[] array_personas = null;
		int n_personas = 0; // número de personas introducidas y además nos vale para saber el hueco del
							// array donde rán las nuevas personas

		// 1 bucle
		int opcion = 0;

		do {

			// 1 mostramos el menú
			mostrarMenu();
			// 2 leerOpcion
			opcion = leerOpcion();
			// 3 casos: hacemos los caminos para cada elección del usuario
			switch (opcion) {
			case 1:
				System.out.println("\t Quiere crear el array \n ");// \t es para el tabulador
				array_personas = new Persona[5];
				System.out.println("\t Nuevo array creado con capacidad para 5 personas (0-4) \n");
				//nuevo:
				n_personas = 0; //por si aca crea un nuevo array, después de haberlo creado ya, inicializamos a 0 el contador de personas aquí también (en teoría sólo debería crear el array 1 vez, pero puede haber un usuario toca_huevos, que lo habrá siempre -nosotros mismo somos todos unos manazas-)
				break;

			case 2:
				System.out.println("\t Quiere insertar una persona \n");
				// lo primero es ver si el array está creado
				if (array_personas != null) {
					// lo segundo es ver si tengo hueco en el array. ello me empuja a ir llevando la
					// cuenta de las personas que se han introduocido, para lo cual declaro un
					// contador al inicio del main (n_personas)
					if (n_personas < 5)// 5 podría ser una constante, luego lo mejoraremos.
					{
						// necesito los datos de una persona --> hago un método que me los dé
						Persona persona_nueva = obtenerPersona();
						// la persona tiene que ir en el array, ¿pero dónde? --> en n_personas !!
						array_personas[n_personas] = persona_nueva;
						// actualizamos el contador de personas,
						n_personas = n_personas + 1;
					} else {
						System.out.println("\t No caben más personas en el array :S \n");
					}
				} else {
					System.out.println("\t Debe primero crear el array - opcion 1 - \n");
				}

				break;
			  case 3:
				System.out.println("\t Quiere insertar un alumno \n");
				// lo primero es ver si el array está creado
				if (array_personas != null) {
					// lo segundo es ver si tengo hueco en el array. ello me empuja a ir llevando la
					// cuenta de las personas que se han introduocido, para lo cual declaro un
					// contador al inicio del main (n_personas)
					if (n_personas < 5)// 5 podría ser una constante, luego lo mejoraremos.
					{
						// necesito los datos de una persona --> hago un método que me los dé
						Alumno alumno_nuevo = obtenerAlumno();
						// la persona tiene que ir en el array, ¿pero dónde? --> en n_personas !!
						array_personas[n_personas] = alumno_nuevo;
						// actualizamos el contador de personas,
						n_personas = n_personas + 1;
					} else {
						System.out.println("\t No caben más personas en el array :S \n");
					}
				} else {
					System.out.println("\t Debe primero crear el array - opcion 1 - \n");
				}

				break;
			case 4:
				System.out.println("\t Quiere mostar el array \n");
				// simplemente hacemos un for desde 0 hasta n_personas
				// primero, nos aseguramos que hay alguna persona que mostrar
				if (n_personas > 0) {
					//y recorremos en tal caso, el array desde cero hasta n_personas
					for (int i = 0; i < n_personas; i++) {

						System.out.println("\tPERSONA " + i);
						/*System.out.println("\t \t Nombre " + array_personas[i].getNombre());
						System.out.println("\t \t Edad " + array_personas[i].getEdad() + "\n");//intro de separación par aque se vea más bonito
			
						*/
						
						array_personas[i].mostrarPersona();
						}
				} else {
					System.out.println("\t No hay personas que mostrar - introduzca primero - \n");
				}
				break;
			case 5:
				System.out.println("\t Quiere mostrar la persona de más edad \n");
				//antes de nada, vamos a ver si el array tiene algo donde buscar :)
				if (n_personas > 0) {
					//ahora deberemos buscar la persona de más edad. Hay que recorrer el array
					//para ello, vamos buscando la persona de mayor edad, que es justo lo que necesitamos 
					Persona persona_mayor = array_personas[0];//empezamos tomando como mayor el primero y vamos comparando
					//for es lo que pega, pues hay que pasar por todos sin excepción para determinar el menor
					for (int i = 1; i < n_personas; i++) {
						if (array_personas[i].getEdad()>persona_mayor.getEdad())//si la persona actual es mayor
						{
							persona_mayor=array_personas[i];//me la guardo a la que es la nueva mayor!
						}
						
					}//al salir de bucle sé que la variable persona_mayor tiene a la persona de mayor edad del array
					System.out.println("\tPERSONA de MAS EDAD \n");
					System.out.println("\t \t Nombre " + persona_mayor.getNombre());
					System.out.println("\t \t Edad " + persona_mayor.getEdad() + "\n");//intro de separación par aque se vea más bonito

					
				} else {
					System.out.println("\t No hay personas para buscar - introduzca primero - \n");
				}
				

				break;
			case 6:
				System.out.println("Quiere vacíar el array");
				array_personas = null;
				System.out.println("array vaciado");// es un vaciado lógico. volvemos a inicializarlo
				// NUEVO ponemos el n_personas a 0
				n_personas = 0;

				break;
			case 7:
				System.out.println("Quiere borrar una persona por su nombre");
				//antes de nada, vamos a ver si el array tiene algo donde buscar :)
				if (n_personas > 0) {
					//ahora deberemos obtener el nombre de la persona
					//para ello, hacemos un método aparte
					String nombre_buscado = pedirNombreABuscar();
					//y ahora recorremos el array buscando ese nombre. Bien hasta que lo encontremos o lleguemos al final
					//pero al menos 1 vez. lo que toca es do-while
					boolean encontrado = false;
					int posicion = 0;
					Persona paux = null;//variable auxiliar para almacenar temporalmente la persona en curso
					
					do {
						paux = array_personas[posicion];
						//comparamos 2 String. OJO que esto es nuevoe E IMPORTANTE 
						//Al ser dos objetos (no int, char o tipos simples) hay que comparar usando el método equals. SIEMPRE se hará así
						if (paux.getNombre().equals(nombre_buscado))//equals devuevel true si son iguales
						{
							encontrado=true;
						} 
						else {
							posicion++;
						}
						
						
					} while ((!encontrado)&&(posicion<n_personas));
					//ha podido concluir el bucle por alguna de las dos condiciones
					//tenemos que discernir por cuál para determinar si se ha encontrado o no
					if (encontrado)
					{
						//bien, debemos de quitar a esa persona y bajar el contador de n_personas
						//la variable posición nos indica donde está la persona que queremos borrar
						//así que vamos a correr las personas una posición hacia atrás desde la posición encontrada
						//hasta el final y así "machacamos" el sitio del que queremos borrar
						//esto mejor dibujarlo o depurarlo para terminar de entenderlo bien y poneros ejemplos 
						
						for (int i = posicion; i < (n_personas-1); i++) {
							
							array_personas[i] = array_personas[i+1];
						}
						n_personas--;
						System.out.println("Persona encontrada en la posicion " + posicion + " eliminada");
						
					} else {
						System.out.println("La persona introducida no existe");
					}
					
					
				} else {
					System.out.println("\t No hay nombres para buscar - introduzca primero - \n");
				}
				

				break;
			case 8:
				System.out.println("Quiere salir");

				break;

			default:
				System.out.println("Opción no disponible");
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
