import java.util.ArrayList;

public abstract class Lista {
	
	
	protected ArrayList<Integer> elementos;
	
	public Lista() {
		this.elementos= new ArrayList<Integer>();
	}
	
	public int getElemento(int elem) {
		return this.elementos.indexOf(elem);
	}
	
	public void insertarElemento(int elem) {
		elementos.add(elem);
	}
	
	public void visualizar() {
		System.out.println(this.elementos.toString());
	}
	
	public abstract void configurar();
	
}
