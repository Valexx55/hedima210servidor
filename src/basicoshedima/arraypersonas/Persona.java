package basicoshedima.arraypersonas;

public class Persona {
	
	private int edad;
	private String nombre;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarPersona ()
	{
		System.out.println("Nombre = " + this.nombre + " Edad "+ this.edad);
		
	}
	
	

}
