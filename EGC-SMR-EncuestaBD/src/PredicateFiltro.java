import com.google.common.base.Predicate;


public class PredicateFiltro implements Predicate<Voto> {
	

private Comunidad ic;

public PredicateFiltro(Comunidad ic){
	
this.ic=ic;
	
}
@Override
public boolean apply(Voto arg0) {
	// TODO Auto-generated method stub
	return arg0.getComunidad().equals(ic);
}

}

