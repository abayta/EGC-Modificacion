import java.util.List;

import com.google.common.collect.Iterables;

/**
 * @param Esta
 *            clase contiene los diferentes tipos de criterios que vamos a
 *            tomar. Debera contener una primera funcion que vaya "eligiendo"
 *            con los datos que recoge las demas funciones que contendran el
 *            criterio con el que modificar. Como el profesor nos dijo que
 *            trabajaramos ahora mismo solo con el criterio de comunidad he
 *            anhadido un parametro "co" haciendo referencia a la comunidad que
 *            se quiera
 * 
 */
public class CriteriosDeModificacion {

	public static Integer votosReferendum(List<Voto> lv, Boolean esReferendum,
			Comunidad co) {
		if (!esReferendum) {
			return votosElecciones(lv, co);
		} else
			return votosComunidad(lv, co);
	}

	/**
	 * 
	 * @param Ahora
	 *            mismo no nos importa esta posibilidad. Solo nos importa el
	 *            caso en el que sea referendum y por el criterio de comunidad.
	 */
	private static Integer votosElecciones(List<Voto> lv, Comunidad co) {
		return null;

	}

	/**
	 * @param 
	 *            Crear filtro pasando la comunidad deseada. Iterable<Voto> se=
	 *            Iterables.filter(lv, new PredicateFiltro(co)); de esta forma
	 *            tambien la podais hacer
	 * 
	 *            Queda por hacer que reconozca que el voto es SI a traves de un
	 *            predicate. Despues le pasas a eleccionCriterio el frequency de
	 *            la lista resultante.
	 */
	private static Integer votosComunidad(List<Voto> lv, Comunidad co) {
		// TODO Auto-generated method stub

		return eleccionCriterio(Iterables.frequency(lv, co), co);

	}

	/**
	 * @param He
	 *            utilizado la funcion de suelo de ejemplo. Supongo que se
	 *            utiliza ese criterio en las generales, sino utilizamos la de
	 *            techo.
	 * 
	 *            Cuando estan todos los criterios creados, se podria quitar el
	 *            parametro de entrada "co" de todos estos mEtodos.
	 */
	private static Integer eleccionCriterio(int frequency, Comunidad co) {
		// TODO Auto-generated method stub
		Integer res;
		switch (co) {
		case GALICIA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case ASTURIAS:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
			
		case CANTABRIA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case PAISVASCO:
			res = (int) (Math.floor((frequency * 0.8)));
			break;	
			
		case ISLASCANARIAS:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case MADRID:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case CASTILLAYLEON:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case COMUNIDADVALENCIANA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case ANDALUCIA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case NAVARRA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case LARIOJA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case REGIONDEMURCIA:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
		case ISLASBALEARES:
			res = (int) (Math.floor((frequency * 0.8)));
			break;
			
		default:
			res = frequency * 1;
			break;
		}

		return res;
	}
}
