package basicoshedima.excepciones;

import java.io.File;
import java.io.FileInputStream;
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
		escribirCuentoPorPantalla(ruta_cuento);

	}
}
