package ListaDeEnteros.ListaDeEnteros;
import java.util.Scanner;

public class Ejercicio1b {

	public static void main(String[] args) {
		System.out.println("Ingrese una secuencia de numeros");
		Scanner in = new Scanner(System.in);
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		int n = in.nextInt();
		while (n != 0){
			lista.agregarInicio(n);
			n = in.nextInt();
		}
		for (int i = 0; i < lista.tamanio(); i++) {
			System.out.println(lista.proximo());
		}
		in.close();
	}

}


