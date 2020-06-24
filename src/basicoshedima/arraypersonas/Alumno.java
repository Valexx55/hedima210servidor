package basicoshedima.arraypersonas;

/**
 * Bean de Alumno
 * @author Jose
 *
 */
public class Alumno extends Persona implements InterfazCocienteIlectual, Comparable<Alumno>{
	
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
	public int calcularCocienteIntelectual() {
		// TODO Auto-generated method stub
		return 120;
	}
	
	@Override
	public Object read(int id) {
		// TODO Auto-generated method stub
		return super.read(id);
	}

	
	@Override
	public boolean create(Object o) {
		// TODO Auto-generated method stub
		return super.create(o);
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

	//si NUM > 0 --> this es mayor
	//si NUM == 0 --> son iguales
	//si NUM <0 --> o es mayor
	@Override
	public int compareTo(Alumno o) {
		int num = 0;
		
		if (this.getNota()> o.getNota()) {
			num = 1;
		} else if (this.getNota()< o.getEdad())
		{
			num = -1;
		}
		
		return num;
	}
	

}
