
public class MonedaEspanya extends Moneda{
	
	public MonedaEspanya() {
		this.configurar();
		
	}
	
	@Override
	public void configurar() {
		this.setValor(1.0);
		this.setTexto("Euro");
	}
}
