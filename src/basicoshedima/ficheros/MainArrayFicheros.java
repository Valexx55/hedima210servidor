package basicoshedima.ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainArrayFicheros {

	public static void main(String[] args) {

		File file = null;
		FileReader fileReader = null;
		try {

			file = new File("ambrosio");
			fileReader = new FileReader(file);
			int letra_leida = 0;
			//recorriendo el fichero
			while ((letra_leida = fileReader.read()) != -1) {
				System.out.println(letra_leida+"-"+(char)letra_leida);
			}
			System.out.println("lECTURA FICHERO ACABADA!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//esta sección se va a ejecutar sí o sí
			//haya habido una excepción o no
			//liberar recursos
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
