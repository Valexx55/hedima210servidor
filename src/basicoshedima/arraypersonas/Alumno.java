package basicoshedima.arraypersonas;

/**
 * Bean de Alumno
 * @author Jose
 *
 */
public class Alumno extends Persona {
	
	private int nota;
	
	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno(int nota) {
		super();
		this.nota = nota;
	}
	
	public Alumno (int nota, String nombre, int edad)
	{
		super (edad, nombre);
		this.nota = nota;
	}
	
	//POLIMORFISMO
	@Override
	public void mostrarPersona() {
		// TODO Auto-generated method stub
		//super.mostrarPersona();
		System.out.println("Nombre a " + this.getNombre() +
				" EDAD a " + this.getEdad() + 
				" NOTA a " + this.getNota());
	}
	

}
