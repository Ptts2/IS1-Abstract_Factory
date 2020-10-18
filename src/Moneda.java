
public abstract class Moneda {
	
	protected String texto;
	protected double valor;
	
	public Moneda() {
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto=texto;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor=valor;
	}
	
	public void visualizar() {
		
		System.out.println(this.texto);
		System.out.println(this.valor);
	}
	
	public abstract void configurar();
}
