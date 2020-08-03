package basicoshedima.arraypersonas;

public class Persona implements InterfazCocienteIlectual, CRUD{
	
	private int edad;
	private String nombre;
	
	public Persona() {
		// TODO Auto-generated constructor stub
		//constructor por defecto
	}
	public Persona(int edad, String nombre) {
		//super();
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
	@Override
	public int calcularCocienteIntelectual() {
		// TODO Auto-generated method stub
		return 100;
	}
	@Override
	public boolean create(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object read(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
