public class ListaCircular {

	private NodoListaCircular lc;

	public ListaCircular() {
		lc = null;
	}

	// Insertar elemento
	public ListaCircular insertarElemento(int entrada) {
		NodoListaCircular nuevo;
		nuevo = new NodoListaCircular(entrada);
		if (lc != null) { // lista circular no vacia
			nuevo.enlace = lc.enlace;
			lc.enlace = nuevo;
		}
		lc = nuevo;
		return this;
	}

	// Eliminar elemento
	public void eliminarElemento(int entrada) {
		NodoListaCircular actual;
		boolean encontrado = false;
		actual = lc;
		while ((actual.enlace != lc) && (!encontrado)) {
			encontrado = (actual.enlace.dato == entrada);
			if (!encontrado) {
				actual = actual.enlace;
			}
		}
		encontrado = (actual.enlace.dato == entrada);
		if (encontrado) {
			NodoListaCircular p;
			p = actual.enlace;
			if (lc == lc.enlace) {
				lc = null;
			} else {
				if (p == lc) {
					lc = actual;
				}
				actual.enlace = p.enlace;
			}
			p = null;
		}
	}
	// Recorrer lista
	public void recorrer() {
		NodoListaCircular p;
		if(lc != null) {
			p = lc.enlace;
			do {
				System.out.print("("+ p.dato+")->");
				p = p.enlace;
			} while (p != lc.enlace);
		}else {
			System.out.println("\t Lista Circular Vacia");
		}
	}
}// class Lista Circular
