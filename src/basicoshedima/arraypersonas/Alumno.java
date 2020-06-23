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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "NOMBRE "+ this.getNombre() +
				" EDAD a " + this.getEdad() + 
				" NOTA a " + this.getNota();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean soniguales=false;
		// TODO tengo que comparar dos alumnos
		// uno this y el otro obj
		Alumno a2 = (Alumno)obj;
		
		if ((this.getNota()==a2.getNota())&&(this.getEdad()==a2.getEdad())&&
				(this.getNombre().contentEquals(a2.getNombre())))
		{
			soniguales=true;
		}
		
		return soniguales; //super.equals(obj);
	}
	

}
