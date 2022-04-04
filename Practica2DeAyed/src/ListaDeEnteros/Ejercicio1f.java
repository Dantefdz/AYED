package ListaDeEnteros.ListaDeEnteros;
import java.util.Scanner;

public class Ejercicio1f {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresame un numerin");
		int n = in.nextInt();
		in.close();
		ListaDeEnterosEnlazada lista = calcularSucesion(n);
		for (int i = 1; i <= lista.tamanio(); i++) {
			System.out.println(lista.elemento(i));
		}
	}
	public static ListaDeEnterosEnlazada calcularSucesion (int n) {
		ListaDeEnterosEnlazada lista;
		if (n != 1){
			if ((n % 2) == 0){
				lista = calcularSucesion(n/2);
			}
			else{
				lista = calcularSucesion((3 * n) + 1);
			}
		}
		else{
			lista = new ListaDeEnterosEnlazada();
		}
		lista.agregarInicio(n);
		return lista;
	}
}
