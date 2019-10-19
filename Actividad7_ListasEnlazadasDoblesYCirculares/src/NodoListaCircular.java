public class NodoListaCircular {
	int dato;
	NodoListaCircular enlace; 
	public NodoListaCircular (int entrada) {
		dato = entrada; 
		enlace = this; 	
	}
}