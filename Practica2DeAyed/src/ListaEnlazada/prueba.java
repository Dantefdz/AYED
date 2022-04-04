package ListaEnlazada.ListaEnlazadaGenerica;
import java.util.Scanner;


public class prueba {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dim = 3;
		Estudiante[] e = new Estudiante[dim];
		 for (int i = 0; i<dim;i++){
	        	e[i]= new Estudiante();
	        	System.out.println("Nombre: ");e[i].setNombre(input.nextLine());
	        	System.out.println("Apellido: ");e[i].setApellido(input.nextLine());
	        	System.out.println("Comision ");e[i].setComision(input.nextLine());
	        	System.out.println("Direccion: ");e[i].setDireccion(input.nextLine());
	        	System.out.println("Email: ");e[i].setEmail(input.nextLine());
	        	System.out.println("-----------------------------");
	        }
		     ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
		     System.out.println(lista.agregar(e,dim));
	         input.close();
	}
	

}
