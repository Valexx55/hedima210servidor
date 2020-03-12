package edu.hedima.val.imc;

public class IMC {
	
	public static double calcula (Persona persona)
	{
		double imc = 0;
			
			imc = (persona.getPeso()/(persona.getAltura()*persona.getAltura()));
		
		return imc;
	}

}
