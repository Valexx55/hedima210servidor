package edu.hedima.val.imc;


//BEAN DE PERSONA o un Plain Old Java Object POJO de PERSONA o JAVA BEAN

/**
 * 
 *La palabra reservada this solo puede aparecer en los métodos de una clase
 *y tiene un significado distinto según donde aparezca:
 *
 *1) Aparecere en el constrcutor --> this es el nuevo objeto que se está creando
 *2) En otro método --> this es el objeto llamante
 *
 */

/**
 * 
 * SOBRE STATIC O NO EN MÉTODOS
 * 
 * Un método estático se define con la palabra static
 * y se invoca mediante el nombre de la clase.
 * Su funcionamiento no varía si fuese invocado con distintos objetos
 * 
 * 
 * Un me´todo NO estático se define SIN la palabra static
 * Se invoca mediante un objeto de la clase
 * Su funcionamiento varía si lo invoco con distitnos objetos
 * (ejemplo length () de String
 * 
 * 
 * String numero_str = "999";
		int num = Integer.parseInt(numero_str);
		
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(2);
		
		n1.parseInt(numero_str);
		n2.parseInt(numero_str);
		
		RESUEMEN: parseInt es un método estático.
		(no depende si lo invoco con un objeto u otro)
		
 *
 */
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
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	

}
