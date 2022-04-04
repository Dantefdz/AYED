package ejercicio4;
import Cola_Pila.*;
import java.util.Scanner;

public class TestBalanceo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese una cadena: "); 
		boolean p1 = true;
		boolean p2 = true;
		boolean p3 = true;
		Character letra;
		String analizar = input.nextLine(); boolean si= true;
		PilaGenerica<Character> pila1 = new PilaGenerica<Character>();
		PilaGenerica<Character> pila2 = new PilaGenerica<Character>();
		PilaGenerica<Character> pila3 = new PilaGenerica<Character>();
		for (int i =0; i<analizar.length();i++){
			letra = analizar.charAt(i);
			if(letra =='{'){
				pila1.Apilar(letra);
				p1 = false;
			}else{
				if(letra=='}'){
					if ((p2)&(p3)){
				    	pila1.Desapilar();
					    p1 = true;
			      	}else{
					si = false;
				    }
			     }
			}
			
			if (letra=='['){
				    pila2.Apilar(letra);
				     p2 = false;
		    }else{ 
				if(letra ==']'){
					if ((p3)&(p1)){
				      pila2.Desapilar();
				       p2 = true;
					}else{
						si = false;
			        }
			     }
		    }
			
			if (letra=='('){
				pila3.Apilar(letra);
				p3= false;
			}else{
				if (letra==')'){
						System.out.println(pila3.Desapilar());
				        p3 = true;
				}else{
						si = false;
					}
				}
	}
    if (si){
		System.out.println("esta balanceado");
    }else{
	    System.out.println("no esta balanceado");
	}
   }
}

