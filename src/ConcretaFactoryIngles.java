
public class ConcretaFactoryIngles implements AbstractFactoryIdiomas{
	
	public Moneda getMoneda() {
		return new MonedaUSA(0.85);
	}
	
	public Lista getLista() {
		return new ListaIngles();
	}
}
