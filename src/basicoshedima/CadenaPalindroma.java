package basicoshedima;

/**
 * El código de esta clase, es un poco misterioso. Algún programador Clase "C",
 * no ha usado nombres descriptivos y ahora, nos toca pegarnos y descubrir qué
 * narices hace este código, para poder usarlo en nuestro proyecto. Se pide: * *
 * 1) Adivinar la funcionalidad del método adivinaQueHace 2) Una vez
 * descubierto, aplicar un nombre apropiado al método y a la clase 3) Idear un
 * método equivalente, pero distinto. Es decir, crear un método que haga lo
 * mismo que adivinaQueHace, pero de otra manera. Con otro algoritmo *4) EXTRA:
 * Sólo si resolviste los puntos anteriores, implementa una versión recursiva **
 */
//SOLUCIÓN: La clase alberga un método que determina si una cadena es palíndroma o no
//CUIADADO CON LA NOMENCLAUTRA. LAS CLASES EN PascalCase siempre empiezan por MAYÚSCULA
public class CadenaPalindroma {

	// renombramos el método y la clase
	private static boolean esPalindromaUno(String cad) {
		boolean bd = true;
		int i = 0;
		int j = cad.length() - 1;
		while ((i <= j) && (bd)) {
			bd = cad.charAt(i) == cad.charAt(j);
			i++;
			j--;
		}
		return bd;
	}

	//.JAVA FUENTE
	//.CLASS CÓDIGO COMPILADO BYTECODES
	//.JAR / .ZIP Java Archive -- Agrupación de class - Paquete - Librería
	//.WAR Web Archive - Aplicación WEB
	//JSE Java Standard Edition
	/**
	 * Versión recursiva: en general algo es recursivo cuando en su definición
	 * aparece él mismo concepto que estamos definiendo. Por ejemplo, una carpeta es
	 * un conjunto de archivos y carpetas
	 * 
	 * En programación la recursividad es una técnica avanzada que se aplica a
	 * problemas muy concretos y que se escapa de nuestro objetivo. Sólo es para que
	 * lo conozcáis.
	 * 
	 * Una función se invoca así misma: aquí el ejemplo. Dentro del cuerpo de la
	 * función hay una llamada a la misma función Con que el concepto os suene
	 * suficiente.
	 * 
	 * @param cad
	 * @return
	 */
	private static boolean esPalindromoRecursivo(String cad) {

		boolean palindromo = false;

		if (cad.length() <= 1)

		{

			palindromo = true;

		}

		else

		{

			if (cad.charAt(0) == cad.charAt(cad.length() - 1))

			{

				palindromo = esPalindromoRecursivo(cad.substring(1, cad.length() - 1));

			}

			else

			{

				palindromo = false;

			}

		}

		return palindromo;

	}

	/**
	 * Función auxiliar que da la vuelta a una palabra
	 * @param palabra
	 * @return
	 */
	private static String invertir(String palabra) {
		String palabra_invertida = null;
		StringBuilder cadena_auxiliar = null;
		
			cadena_auxiliar = new StringBuilder(palabra);
			palabra_invertida = cadena_auxiliar.reverse().toString();
			
		return palabra_invertida;
	}

	// VERSIÓN ALTERNATIVA
	private static boolean esPalindromaDos(String cad) {
		boolean palindroma = false;//sección de declaración
		String al_verres = null;
		
			al_verres = invertir(cad);//le damos la vuelta a la original
			if (al_verres.equals(cad)) {//si la original y la dada la vuelta son iguales
				palindroma = true;//es que es palíndroma (capicúa en número)
			}
			
		return palindroma;
	}

	public static void main(String[] args) {
		if (esPalindromaUno("hala madrid")) {
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
		
		if (esPalindromaDos("roma o amor")) {
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
		
		if (esPalindromoRecursivo("pop")) {
			System.out.println("VERDADERO");
		} else {
			System.out.println("FALSO");
		}
		
		/*int num = 0;
		switch (num) {
		case 0:
			
			System.out.println("El número vale 0");
			
			
			break;
		
		case 1:
			
			System.out.println("El número vale 1");
			
			
			break;

		default:
			System.out.println("El número vale distinto de 0 y de 1");
			
			break;
		}
		*/
	}

}
