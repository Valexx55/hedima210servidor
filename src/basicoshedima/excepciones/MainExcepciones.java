package basicoshedima.excepciones;


public class MainExcepciones {
	
	public static void main(String[] args) {
		
		try { //TÚ INTENTA ESTO
			String[] array_palabras = new String[2];
			array_palabras[2].length();
		} catch (NumberFormatException e) { //Y SI FALLA, YO CAPTURO EL FALLO
			// TODO: TRATAMOS EL FALLO
			e.printStackTrace();
			System.out.println("Se ha producido un fallo number");
		}
		catch (NullPointerException e) { //Y SI FALLA, YO CAPTURO EL FALLO
			// TODO: TRATAMOS EL FALLO
			e.printStackTrace();
			//TODO SE HACE UN LOG log4j
			System.out.println("Se ha producido un fallo null");
		}
		catch (Throwable e) { //Y SI FALLA, YO CAPTURO EL FALLO
			// TODO: TRATAMOS EL FALLO
			e.printStackTrace();
			System.out.println("Se ha producido un fallo general ");
		}
		
		
		System.out.println("Fin de programa");
		
	}
	
	

}
