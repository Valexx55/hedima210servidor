package edu.hedima.val.imc;

public enum TiposIMC {DESNUTRIDO, BAJOPESO, NORMAL, SOBREPESO, OBESO;

	public static TiposIMC traduceIMC (double imc) 
	{
		TiposIMC devuelvo = null;
		
			if (imc<16)
				devuelvo = TiposIMC.DESNUTRIDO;
			else if (imc>=16 && imc<18.5) 
					devuelvo = TiposIMC.BAJOPESO;
				 else if (imc>=18.5 && imc < 25) 
					 	devuelvo = TiposIMC.NORMAL;
				 	  else if (imc>=25 && imc < 31) 
				 		  	devuelvo = TiposIMC.SOBREPESO;
				 	  else devuelvo = TiposIMC.OBESO;
		
		return devuelvo;
	}
}