package basicoshedima.ficheros;

import java.io.File;
import java.io.FileReader;

public class MainArrayFicheros {

	public static void main(String[] args) {

		try {

			File file = new File("ambrosio");
			FileReader fileReader = new FileReader(file);
			int letra_leida = 0;
			while ((letra_leida = fileReader.read()) != -1) {
				System.out.println(letra_leida);
			}

			fileReader.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
