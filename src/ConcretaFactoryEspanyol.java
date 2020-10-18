
public class ConcretaFactoryEspanyol implements AbstractFactoryIdiomas{
	
	public Moneda getMoneda() {
		return new MonedaEspanya();
	}
	
	public Lista getLista() {
		return new ListaEspanyol();
	}
}
