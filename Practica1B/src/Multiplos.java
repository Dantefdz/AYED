import java.util.Scanner;
import java.util.Arrays;

public class Multiplos {
	private static Scanner s;

	public static int[] multiplosDeNumero(int n) {
		int[] intArray = new int[n];
		for (int i = 0; i < n; i++)
			intArray[i] = n * (i + 1);
		return intArray;
	}

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.print("Por favor, ingrese un n?mero: ");
		int num = s.nextInt();
		while (num != 0) {
			System.out.println(Arrays.toString(multiplosDeNumero(num)));
			System.out.print("Por favor, ingrese un n?mero: ");
			num = s.nextInt();
		}

	}

}