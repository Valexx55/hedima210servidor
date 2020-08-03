package edu.hedima.val.imc;

import java.util.Scanner;

public class EntradaSalida {
	
	public static double obtenerPeso ()
	{
		double peso = 0;
		Scanner scaner = null;
		
			System.out.println("Introduce peso (kg):");
			scaner = new Scanner(System.in);
			peso = scaner.nextDouble();

		return peso;
	}
	
	
	public static double obtenerAltura ()
	{
		double altura = 0;
		Scanner scaner = null;
		
			
			System.out.println("Introduce altura (m):");
			scaner = new Scanner(System.in);
			altura = scaner.nextDouble();
			
		return altura;
	}
	
	public static String obtenerNombre ()
	{
		String nombre = null;
		Scanner scaner = null;
		
			
			System.out.println("Introduce nombre:");
			scaner = new Scanner(System.in);
			nombre = scaner.next();
			
		return nombre;
	}
	
	public static void mostrarIMC (double imc)
	{
		
		TiposIMC tipo = TiposIMC.traduceIMC(imc);
		System.out.println("SU IMC ES " + imc +" que es " + tipo);
	}
	
	public static void mostrarIMC (double imc, String nombre)
	{
		
		TiposIMC tipo = TiposIMC.traduceIMC(imc);
		System.out.println(nombre + ", SU IMC ES " + imc +" que es " + tipo);
	}
	
	public static void mostrarIMC (double imc, Persona p)
	{
		
		TiposIMC tipo = TiposIMC.traduceIMC(imc);
		System.out.println(p.getNombre() + ", SU IMC ES " + imc +" que es " + tipo);
		System.out.println("Corresponde a " + p.getAltura() + "m " + p.getPeso() + " kg");
		
	}
	
}
