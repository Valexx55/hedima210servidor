package basicoshedima;

/**
 * 
 * @author Alumno
 * 
 * Esta clase representa un documento nacional de identidad español
 *
 */
public class Dni {
	
	private int numero;//comentario de línea
	private char letra;
	
	static final String SECUENCIA_LETRAS_DNI  = "TRWAGMYFPDXBNJZSQVHLCKE";
	
	/**
	 * Esta función calcula la letra de un dni
	 * @return la letra calculada
	 */
	public char calcularLetra ()
	{
		char letra = ' ';
		
			int resto = (this.numero%23);
			letra = SECUENCIA_LETRAS_DNI.charAt(resto);
		
		
		return letra;
	}
	
	/**
	 * El método comprueba que el DNI es válido
	 * Un dni es válido si la letra coincide con su número correspondiente
	 * @return true si es válido, false, si no
	 */
	public boolean esValido()
	{
		boolean valido = false;
			
			if (this.letra == this.calcularLetra()) {
				valido = true;
			}
		//	valido = (this.letra == this.calcularLetra());
		
		return valido;
	}
	
	public char calcularYAsignarLetra ()
	{
		char letra = ' ';
		
			int resto = (this.numero%23);
			letra = SECUENCIA_LETRAS_DNI.charAt(resto);
			this.letra = letra;
		
		
		return letra;
	}


	public Dni(int numero, char letra) {

		this.numero = numero;
		this.letra = letra;

	}

	public Dni() { // CONSTRUCTOR POR DEFECTO
	}
	
	

	public Dni(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getLetra() {
		return this.letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	//MÉTODOS DE ACCESO 
	


	
	

	
	
	

}
