package basicoshedima;

import java.util.Scanner;

public class PrincipalCadenas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Intro peso");

	    String peso = scanner.nextLine();  // Read user input
	    System.out.println("Su peso es " + peso);  // Output user input
	    
	    int n_peso = Integer.parseInt(peso);
	    System.out.println("Su peso num es  " + n_peso);  // Output user input
	    
		
		
//		// TODO
//		/**
//		 * HACED UN MAIN QUE IMPRIMA POR PANTALLA el argumento CON MAYOR LONGUITUD
//		 */
//		/**
//		 * HACED UN MAIN QUE IMPRIMA POR PANTALLA los argumentos que contengan la 'a'
//		 */
//		//FOR EACH
//		System.out.println("for each");
//		for (String cadena : args)
//		{
//			System.out.println(cadena);
//		}
//		System.out.println("FIN for each");
//		
//		/**
//		 * Hacer un main que imprima por pantalla los argumentos que contengan la a
//		 */
//		String palabra_actual = null;
//		int posicion_actual;
//		boolean letra_a_encontrada;
//		for (int i = 0; i < args.length; i++) {
//			palabra_actual = args[i];
//			letra_a_encontrada = false;
//			posicion_actual = 0;
//			/*do {
//				if (palabra_actual.charAt(posicion_actual)=='a')
//				{
//					System.out.println("A encontrada " + palabra_actual);
//					letra_a_encontrada = true;
//					
//				} else {
//					posicion_actual++;
//				}
//				
//			}while((!letra_a_encontrada)&&(posicion_actual< palabra_actual.length()));//mientras NO encuentre la A Y no llegue al final*/
//			if (palabra_actual.indexOf("a")!=-1)
//			{
//				System.out.println(palabra_actual);
//			}
//			if (palabra_actual.contains("a"))
//			{
//				System.out.println(palabra_actual);
//			}
//		}

		/*
		 * for (int i = 0; i < args.length; i++) { //System.out.println(args[i]); if
		 * (args[i].length()>=5) { System.out.println(args[i]); } }
		 */

		// TODO que imprima por pantalla el argumento con mayor longitud
/*
		int mayor_longitud = 0;
		int posicion = -1;
		for (int h = 0; h < args.length; h++) {
			if (args[h].length() > mayor_longitud) {
				posicion = h;
				mayor_longitud = args[h].length();
			}
		}
		if (posicion != -1) {
			System.out.println("el argumento con mayor longitud es: " + args[posicion]);
		}
*/
	}
}
