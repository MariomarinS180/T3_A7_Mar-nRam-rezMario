class ListaDoblementeEnlazada {
	int dato;
	Nodo adelante;
	Nodo atras;

	public class Nodo {
		public Nodo(Elemento entrada) {
		}

		int dato;
		Nodo adelante;
		Nodo atras;
	}

	public void Nodo(int entrada) {
		dato = entrada;
		adelante = atras = null;
	}

	// Insertar un elemento en la cabeza
	class Elemento {
	}

	Nodo cabeza;

	public ListaDoblementeEnlazada insertarCabezaLista(Elemento entrada) {
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.adelante = cabeza;
		if (cabeza != null)
			cabeza.atras = nuevo;
		cabeza = nuevo;
		return this;
	}

	// Insertar despues de un nodo
	public ListaDoblementeEnlazada insertaDespues(Nodo anterior, Elemento entrada) {
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.adelante = anterior.adelante;
		if (anterior.adelante != null)
			anterior.adelante.atras = nuevo;
		anterior.adelante = nuevo;
		nuevo.atras = anterior;
		return this;
	}

	// Eliminar elemento
	public void eliminar(Elemento entrada) {
		Nodo actual;
		boolean encontrado = false;
		actual = cabeza;

		while ((actual != null) && (!encontrado)) {

			if (!encontrado)
				actual = actual.adelante;
		}

		if (actual != null) {

			if (actual == cabeza) {
				cabeza = actual.adelante;
				if (actual.adelante != null)
					actual.adelante.atras = null;
			} else if (actual.adelante != null) {
				actual.atras.adelante = actual.adelante;
				actual.adelante.atras = actual.atras;
			} else 
				actual.atras.adelante = null;
			actual = null;
		}
	}
}