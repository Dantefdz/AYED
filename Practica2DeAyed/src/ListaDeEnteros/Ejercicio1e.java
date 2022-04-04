package ListaDeEnteros.ListaDeEnteros;
public class Ejercicio1e {
     static void ImprimirListaRecursivo(ListaDeEnterosEnlazada lista) {
		int n;
		if (!lista.fin())
		{
			n = lista.proximo();
			ImprimirListaRecursivo(lista); 
			System.out.println(n);
// guardas en n el dato en que estas y avanzas al proximo, luego de eso lo llamas a si mismo
// hasta llegar al final, cuando llega imprime el ultimo y va retrocediendo.
		} 	
	}
}


