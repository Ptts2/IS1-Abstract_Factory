import java.util.ArrayList;

public class ListaEspanyol extends Lista{
	
	public ListaEspanyol() {
		this.elementos=new ArrayList<Integer>();
		this.configurar();
	}

	@Override
	public void configurar() {
		this.insertarElemento(20);
	}
}
