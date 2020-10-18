
public class Cliente {

	AbstractFactoryIdiomas idioma;
	public Cliente(AbstractFactoryIdiomas idioma) {
		this.idioma=idioma;
		
	}
	
	public void visualizaElems() {
		
		idioma.getMoneda().visualizar();
		idioma.getLista().visualizar();
	}
}
