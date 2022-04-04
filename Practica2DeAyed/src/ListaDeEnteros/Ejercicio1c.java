package ListaDeEnteros.ListaDeEnteros;
import java.util.Scanner;

public class Ejercicio1c {
	public static void main(String[] args) {
		System.out.println("Ingrese una secuencia de numeros: ");
		Scanner in = new Scanner(System.in);
		ListaDeEnterosEnlazada lista  = new ListaDeEnterosEnlazada();
		int n = in.nextInt();
		while (n != 0){
			lista.agregarInicio(n);
			n = in.nextInt();
		}
        lista.comenzar();
		for (int i = 1; i <= lista.tamanio() ; i++) {
			System.out.println(lista.proximo());
		}
		in.close();
	}
	
}
