package basicoshedima.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * CLASE PARA TRABAJAR CON EL API JAVA-IO
 * 
 * CON FICHEROS
 * 
 * CON FICHERO ÚNICAMENTE PUEDO HACER 4 COSAS
 * 
 * ABRIR
 * LEER
 * ESCRIBIR
 * CERRAR
 * 
 * @author Jose
 *
 */
public class MainFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			File file = new File("ambrosio");
			if (file.exists()) {
				
				if (file.delete()) {
					System.out.println("Fichero borrado con éxito");
				}
			} else {
				System.out.println("El fichero NO existe");
				if (file.createNewFile()) {
					System.out.println("Fichero creado con éxito");
					System.out.println("El fichero existe");
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write("Ambrosio, los bombones por favor");
					fileWriter.close();
				} else {
					System.out.println("Fichero NO creado");
				}

			}

			if (file.isDirectory()) {
				System.out.println("El fichero es un Directorio");
			} else if (file.isFile()) {
				System.out.println("El fichero es un fichero");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
