package edu.hedima.val.imc;

public class Principal {
	
	public static void main(String[] args) {
		
				
		double peso = EntradaSalida.obtenerPeso();
		double altura = EntradaSalida.obtenerAltura();
		String nombre = EntradaSalida.obtenerNombre();
		String nombre2 = EntradaSalida.obtenerNombre();
	
	
		Persona persona = new Persona(peso, altura, nombre);
		Persona persona2 = new Persona(peso, altura, nombre);
	
		double imc = IMC.calcula(persona);
		EntradaSalida.mostrarIMC(imc, persona);
		
	}

}
