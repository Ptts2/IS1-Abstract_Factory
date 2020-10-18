import java.util.ArrayList;

public class ListaIngles extends Lista{
	
	public ListaIngles() {
		this.elementos=new ArrayList<Integer>();
		this.configurar();
	}

	@Override
	public void configurar() {
		this.insertarElemento(10);
	}
}
