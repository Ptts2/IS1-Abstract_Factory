
public class Principal {
	    public static void main(String[] args)
	    {
	        // CREAR EN ESPA�OL 
	    	
	         Cliente cliente = new Cliente( new ConcretaFactoryEspanyol() );
	         cliente.visualizaElems();
	     
	      
	         // CREAR EN INGLES
	         cliente = new Cliente ( new ConcretaFactoryIngles() );
	         cliente.visualizaElems();
		     
	    }    
	       
	}

