package basicoshedima.excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * En esta clase vamos a leer un fichero de propiedades mediante la clase
 * Properties
 * 
 * CON LAS EXCEPCIONES, TENEMOS DOS TIPOS:
 * 
 * LAS RUNTIMEEXCEPTIONS Y LAS NO
 * 
 * LAS RUNTIME JAVA NO ME OBLIGA A PONER SECCCI�N TRY-CATCH LAS NO RUNTIME S� ME
 * OBLIGA A PONER TRY-CATCH
 * 
 * @author Jose
 *
 */
public class MainProperties {
	
	//declaramos una constante siempre en may�suclas
	//static a nivel de clase
	//final es una constante --> no se va a poder modificar su valor
	public static final String MENSAJE_ERROR = "El n�mero debe ser entre 1 y 3";
	public static final String MENSAJE_ERROR2 = "Introduce un n�mero, malvado";

	
	
	/*
	 * partiendo del ejercicio de el cuento, a�adid otra propiedad al fichero de
	 * propiedades llamada salida que contenga el nombre del fichero donde se va a
	 * escribir el cuento. Es decir, ya no saldar� por patnall sino que el cuento
	 * ser� escrito en un fichero, con el nombre dado en las properties
	 */

	public static void escribirCuentoPorPantalla(String ruta_cuento) {
		//MENSAJE_ERROR = "torpedo";
		Properties properties = null;
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(ruta_cuento)));
			System.out.println(properties.getProperty("start") + " " + properties.getProperty("body") + " "
					+ properties.getProperty("end"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void escribirCuentoPorFichero(String ruta_cuento) {
		Properties properties = null;
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(ruta_cuento)));// cargo properties
			String nombre_fichero_salida = properties.getProperty("salida");// leo la ruta de salida
			FileWriter cuento_salida = new FileWriter(nombre_fichero_salida);// preparo fichero salida
			// FileWriter cuento_salida = new FileWriter(nombre_fichero_salida,
			// true);//preparo fichero salida
			cuento_salida.write(properties.getProperty("start") + " " + properties.getProperty("body") + " "
					+ properties.getProperty("end"));// escribo en �l
			cuento_salida.close();// cierro

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * y como seria el try catch con la entrada y salida est�ndar? del teclado si
	 * quieres un entero y recibes un string como controlas cuando se pide una
	 * opci�n por teclado que es un numero y tu tecleas un String?
	 */

	
	private static void mostrarMenu ()
	{
		System.out.println("Elija el idioma del cuento");
		System.out.println("Pulse 1 para Espa�ol");
		System.out.println("Pulse 2 para Ingl�s");
		System.out.println("Pulse 3 para Italiano");
	}
	
	public static void main(String[] args) {
		String ruta_cuento = "cuento_es.properties";
		// Scanner reader = new Scanner(System.in);//scanner para leer por la entrada
		// est�ndar
		Properties properties = new Properties();
		boolean opcion_correcta = false;
		int eleccion_idioma = 0;
		String str_eleccion = null;
		Scanner scanner = null;
		do {

			mostrarMenu ();
			try {
				scanner = new Scanner(System.in);
				eleccion_idioma = scanner.nextInt();//vallidamos la entrada y controlamos que sea un n�mero
				if ((eleccion_idioma==1 || eleccion_idioma==2 ||eleccion_idioma==3))
					{//y que est� entre 1 y 3
					opcion_correcta = true;
					} else {
						System.out.println(MainProperties.MENSAJE_ERROR);
					}
			} catch (Exception e) {
				System.out.println(MENSAJE_ERROR2);
				//e.printStackTrace();
			} 
		} while (!opcion_correcta);

		System.out.println(eleccion_idioma);

		switch (eleccion_idioma) {
		case 1:
			ruta_cuento = "cuento_es.properties";
			break;
		case 2:
			ruta_cuento = "cuento_en.properties";
			break;
		case 3:
			ruta_cuento = "cuento_it.properties";
			break;

		default:
			break;
		}
		// escribirCuentoPorPantalla(ruta_cuento);
		escribirCuentoPorFichero(ruta_cuento);

	}
}
