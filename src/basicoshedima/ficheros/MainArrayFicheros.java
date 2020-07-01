package basicoshedima.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MainArrayFicheros {

	/*
	 *
	 * 4 MÉTODOS PARA LA PRÁCTICA DE FICHEROS
	 * 
	 * 1. Dada un nombre de fichero, devolver el número de caracteres que tiene. -1
	 * si hay algun problema con el fichero 2. Dada un nombre de fichero, devolver
	 * el número de líenas que tiene. -1 si hay algun problema con el fichero
	 * 3."LOAD" Dado un nombre de un fichero, devovler una Lista de lineas
	 * contenidas en el fichero. Null si hay algún problema 
	 * 4. "VOLCAR" Dado un
	 * nombre de un fichero y una Lista de String, volcad el contenido de la lista
	 * en el fichero. Por lineas
	 * 
	 */
	
	//EJERCICIO 4
	
	public static void volcarListaEnFichero (List<String> lista, String nombre_fichero)
	{
		
	}
	//EJERCICIO 3
	/**
	 * Carga un fichero de texto en una lista
	 * @param nombre_fichero el nombre del fichero
	 * @return la lista donde cada posición es una línea del fichero
	 */
	public static List<String> cargarFicheroEnLista (String nombre_fichero)
	{
		List<String> lista_devuelta = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String linea_leida = null;
		
			try {
				
				fileReader = new FileReader(nombre_fichero);
				bufferedReader = new BufferedReader (fileReader);
				lista_devuelta = new ArrayList<String>();
				while ((linea_leida=bufferedReader.readLine())!=null)
				{
					lista_devuelta.add(linea_leida);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fileReader.close();
				} catch (IOException e) {
					System.out.println("Error al liberar recursos");
					e.printStackTrace();
				}
				try {
					bufferedReader.close();
				} catch (IOException e) {
					System.out.println("Error al liberar recursos");
					e.printStackTrace();
				}
			}
			
			
		
		return lista_devuelta;	
	}

	// EJERCICIO 1
	/**
	 * Contamos el número de caracteres de un fichero
	 * @param nombre_fichero el nombre/la ruta del fichero
	 * @return el número de caractres que tiene el fichero o -1 si está vacío o hay algún problema con el fichero
	 */
	public static int obtenerNumeroCaracteresFichero(String nombre_fichero) {
		int num_caracteres = 0;
		FileReader fileReader = null;

		try {
			fileReader = new FileReader(nombre_fichero);

			while (fileReader.read() != -1) {
				num_caracteres++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
			num_caracteres = -1;
		}
		
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error al liberar recursos");
				e.printStackTrace();
			}
		}

		return num_caracteres;
	}
	
	
	//EJERCICIO 2
	/**
	 * Cuenta las líneas de un fichero de texto
	 * @param nombre_fichero el nombrel del fichero
	 * @return las líneas que tiene le fichero -1 si hay algún fallo o el fichero está vacío
	 */
	public static int obtenerNumeroLineasFichero(String nombre_fichero) {
		int num_lineas = 0;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(nombre_fichero);
			bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.readLine() != null) {
				num_lineas++;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error al leer el fichero");
			e.printStackTrace();
			num_lineas = -1;
		}
		
		finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error al liberar recursos");
				e.printStackTrace();
			}
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("Error al liberar recursos");
				e.printStackTrace();
			}
		}

		return num_lineas;
	}

	
	
	public static void main(String[] args) {
		
		int num_chars = obtenerNumeroCaracteresFichero("ambrosio");
		System.out.println("El fichero tiene " + num_chars + " caracteres");

		int num_lineas = obtenerNumeroLineasFichero("ambrosio");
		System.out.println("El fichero tiene " + num_lineas + " lineas");
		
		List<String> lista_palabras = cargarFicheroEnLista("ambrosio");
		Collections.sort(lista_palabras);
		int indice = 1;
		for (String linea : lista_palabras)
		{
			System.out.println(indice + " "+ linea);
			indice++;
		}

	}

}
