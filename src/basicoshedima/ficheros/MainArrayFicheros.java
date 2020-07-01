package basicoshedima.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainArrayFicheros {

	
	/*
	 *
	 * 4 M�TODOS PARA LA PR�CTICA DE FICHEROS
	 * 
	 * 1. Dada un nombre de fichero, devolver el n�mero de caracteres que tiene. -1 si hay algun problema con el fichero 
	 * 2. Dada un nombre de fichero, devolver el n�mero de l�enas que tiene. -1 si hay algun problema con el fichero 
	 * 3. "LOAD" Dado un nombre de un fichero, devovler una Lista de lineas contenidas en el fichero. Null si hay alg�n problema 
	 * 4. "VOLCAR" Dado un nombre de un fichero y una Lista de String, volcad el contenido de la lista en el fichero. Por lineas
	 * 
	 */
	
	
	
	public static void main(String[] args) {

		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;//voy a leer por bloques
		String linea_leida = null;
		try {
			file = new File("ambrosio");//preparo fichero
			fileReader = new FileReader(file);//preparo para leerlo
			bufferedReader = new BufferedReader(fileReader);//preparo para leerlo por bloques
			
//			linea_leida = bufferedReader.readLine();
//			while (linea_leida!=null)
//			{
//				System.out.println(linea_leida);
//				linea_leida = bufferedReader.readLine();
//			}
			
			while ((linea_leida=bufferedReader.readLine())!=null)
			{
				System.out.println(linea_leida);
			}
			
			//leyendo por caracteres
			/*int letra_leida = 0;
			//recorriendo el fichero
			while ((letra_leida = fileReader.read()) != -1) {
				System.out.println(letra_leida+"-"+(char)letra_leida);
			}*/
			System.out.println("lECTURA FICHERO ACABADA!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//esta secci�n se va a ejecutar s� o s�
			//haya habido una excepci�n o no
			//liberar recursos
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}

}
