package basicoshedima.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import basicoshedima.excepciones.NotaException;

public class MainArrayFicheros {

	/*
	 *
	 * 4 MÉTODOS PARA LA PRÁCTICA DE FICHEROS
	 * 
	 * 1. Dada un nombre de fichero, devolver el número de caracteres que tiene. -1
	 * si hay algun problema con el fichero 2. Dada un nombre de fichero, devolver
	 * el número de líenas que tiene. -1 si hay algun problema con el fichero
	 * 3."LOAD" Dado un nombre de un fichero, devovler una Lista de lineas
	 * contenidas en el fichero. Null si hay algún problema 4. "VOLCAR" Dado un
	 * nombre de un fichero y una Lista de String, volcad el contenido de la lista
	 * en el fichero. Por lineas
	 * 
	 */

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

	}

}
