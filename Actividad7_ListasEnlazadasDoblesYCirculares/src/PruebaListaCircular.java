import java.util.Scanner;

public class PruebaListaCircular {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int e1 = 0;
		int e2 = 0;
		int e3 = 0;
		int e4 = 0;
		int e5 = 0;
		byte opc = 0;
		int eli = 0;
		ListaCircular lc1 = new ListaCircular();

		System.out.println(" ========== LISTA CIRCULAR ==========");
		System.out.println("Ingrese cinco elementos: ");
		e1 = e.nextInt(); 
		e2 = e.nextInt();
		e3 = e.nextInt(); 
		e4 = e.nextInt();
		e5 = e.nextInt();
		lc1.insertarElemento(e1);
		lc1.insertarElemento(e2);
		lc1.insertarElemento(e3);
		lc1.insertarElemento(e4);
		lc1.insertarElemento(e5);
		do {
			System.out.print("Que desea hacer\n1)Ver todos los elementos\n2)Eliminar un elemento\n3)Salir");
			opc = e.nextByte();
			
			switch (opc) {
			case 1:
				lc1.recorrer();
				break;
			case 2: 
				System.out.print("Disponibles: "); lc1.recorrer();
				System.out.println("Ingrese el elemento a eliminar: ");
				eli = e.nextInt(); 
				lc1.eliminarElemento(eli);
				System.out.print("Lista Circular actualizada: "); lc1.recorrer();
				break;
			case 3: 
				System.out.println("Salió...");
				break;
			default: System.out.println("No está en la lista");
			break;
			}
		} while (opc != 3);
		e.close();
	}
}
