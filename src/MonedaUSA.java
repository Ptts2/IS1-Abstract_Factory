
public class MonedaUSA extends Moneda{
	
	public MonedaUSA(double valor) {
		this.setValor(valor);
		this.configurar();
	}
	
	@Override
	public void configurar() {
		this.setTexto("Dolar");
	}
}
