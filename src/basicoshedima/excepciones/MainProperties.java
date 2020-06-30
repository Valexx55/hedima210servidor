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
 * LAS RUNTIME JAVA NO ME OBLIGA A PONER SECCCIÓN TRY-CATCH LAS NO RUNTIME SÍ ME
 * OBLIGA A PONER TRY-CATCH
 * 
 * @author Jose
 *
 */
public class MainProperties {
	
	/*partiendo del ejercicio de el cuento, añadid otra propiedad al fichero de 
	 * propiedades llamada salida que contenga el nombre del fichero donde se va a escribir el cuento.
	 *  Es decir, ya no saldará por patnall 
	sino que el cuento será escrito en un fichero, con el nombre dado en las properties */
	
	public static void escribirCuentoPorPantalla (String ruta_cuento)
	{
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
	
	public static void escribirCuentoPorFichero (String ruta_cuento)
	{
		Properties properties = null;
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(ruta_cuento)));//cargo properties
			String nombre_fichero_salida = properties.getProperty("salida");//leo la ruta de salida
			FileWriter cuento_salida = new FileWriter(nombre_fichero_salida);//preparo fichero salida
			//FileWriter cuento_salida = new FileWriter(nombre_fichero_salida, true);//preparo fichero salida
			cuento_salida.write(properties.getProperty("start") + " " + properties.getProperty("body") + " "
					+ properties.getProperty("end"));//escribo en él
			cuento_salida.close();//cierro

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		String ruta_cuento = "cuento_es.properties";
		Scanner reader = new Scanner(System.in);//scanner para leer por la entrada estándar
		Properties properties = new Properties();

		int eleccion_idioma = 0;
		
	
		
		System.out.println("Elija el idioma del cuento");
		System.out.println("Pulse 1 para Español");
		System.out.println("Pulse 2 para Inglés");
		System.out.println("Pulse 3 para Italiano");

		eleccion_idioma = reader.nextInt();
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
		//escribirCuentoPorPantalla(ruta_cuento);
		escribirCuentoPorFichero(ruta_cuento);

	}
}
