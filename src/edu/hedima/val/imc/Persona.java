package edu.hedima.val.imc;


//BEAN DE PERSONA o un Plain Old Java Object POJO de PERSONA o JAVA BEAN

public class Persona {
	
	private String nombre;
	private double peso;
	private double altura;
	
	public Persona(double peso, double altura, String nombre) {
		this.peso = peso;
		this.altura = altura;
		this.nombre = nombre;
	}
	
	public Persona(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	

}
