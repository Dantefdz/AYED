package ListaEnlazada.ListaEnlazadaGenerica;
import java.util.Scanner;

public class TestListaEnlazadaGenerica {
	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<>();
		Estudiante e ;;
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese datos de 4 estudiantes: ");
        for (int i = 1; i<=4;i++){
        	e = new Estudiante();
        	System.out.println("Nombre: ");e.setNombre(input.nextLine());
        	System.out.println("Apellido: ");e.setApellido(input.nextLine());
        	System.out.println("Comision ");e.setComision(input.nextLine());
        	System.out.println("Direccion: ");e.setDireccion(input.nextLine());
        	System.out.println("Email: ");e.setEmail(new Scanner(System.in).nextLine());
        	lista.agregarFinal(e);
        	System.out.println("-----------------------------");
        }
        lista.comenzar();
        for (int i = 1; i<=4;i++){
            e = new Estudiante();
            e = lista.proximo();
            System.out.println(e.TusDatos());
        }
        
        input.close();
	}
	
}
