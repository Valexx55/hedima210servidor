package basicoshedima.arraypersonas;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface PlanRestaurantes { //qu� hacer la app
	
	//reservar un restaurante
	
	Date reservarEnRestaurante (Cliente c, Restaurante r);
	
	//buscarPorValoracion
	List<Restaurante> buscarRestaurantesPorValoracion (int puntuacion);
	
	
	
	


}
