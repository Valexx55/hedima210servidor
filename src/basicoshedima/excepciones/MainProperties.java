package basicoshedima.excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * En esta clase vamos a leer un fichero de propiedades
 * mediante la clase Properties
 * 
 * CON LAS EXCEPCIONES, TENEMOS DOS TIPOS:
 * 
 * LAS RUNTIMEEXCEPTIONS
 * Y LAS NO
 * 
 * LAS RUNTIME JAVA NO ME OBLIGA A PONER SECCCIÓN TRY-CATCH
 * LAS NO RUNTIME SÍ ME OBLIGA A PONER TRY-CATCH
 * 
 * @author Jose
 *
 */
public class MainProperties {

	public static void main(String[] args) {
		String ruta_cuento = "cuento_es.properties";
		
		Properties properties = new Properties();
		//String valor_saludo = properties.get("saludo");
		try {
			properties.load(new FileInputStream(new File(ruta_cuento)));
			System.out.println(properties.getProperty("saludo"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Integer.parseInt("koko");
//		String palabra = null;
//		palabra.length();
	}
}
