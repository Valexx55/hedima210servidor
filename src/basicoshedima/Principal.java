package basicoshedima;

import java.util.ArrayList;

public class Principal {

	
	//PUNTO DE ENTRADA AL PROGRAMA
	public static void main(String[] args) {

//		Dni dni1 = new Dni(53130984);//me creo un dni nuevo, con su número
//		char letra_calcuada = dni1.calcularLetra();//calculo la letra de ese dni
//		dni1.setLetra(letra_calcuada);//le asigno la letra al dni
//		
//		System.out.println(dni1.getNumero()+dni1.getLetra());
//		System.out.println(dni1.getNumero()+ " - "+ dni1.getLetra());
		
		//pruebo caso bueno
		Dni dniprueba = new Dni(51936651, 'Y');
		System.out.println(dniprueba.esValido());
		
		//prueba caso malo
		Dni dniprueba2 = new Dni(51936651, 'X');
		System.out.println(dniprueba2.esValido());
		
		
		
		
	}

}
