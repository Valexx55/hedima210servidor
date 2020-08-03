package basicoshedima;

public class MainPrueba {

	public static void main(String[] args) {
		new String("HOLA").length();
		//ESCAPAR --> PARA INDICAR QUE UN CARACTER DE CONTROL FORMA PARTE DE LA INFORMACIÓN
		int n = new String("{\"id\":7,\"nombre\":\"luis\",\"pwd\":\"unahoramenosencanarias\"}").length();
		System.out.println(n);
	}
}
