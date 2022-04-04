package ejercicio4;
import Cola_Pila.*;
import java.util.Scanner;

public class Correcto {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese una cadena: "); 
		Character letra; Character dato;
		String analizar = input.nextLine();
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		for (int i =0; i<analizar.length();i++){
			letra = analizar.charAt(i);
			if((letra =='{')|(letra =='[')|(letra=='(')){
				pila.Apilar(letra);
			}
			if(letra=='}'){
				dato = pila.Desapilar();
				if(dato != '{'){
					pila.Apilar(dato);
				}
			}
			if(letra==']'){
				dato = pila.Desapilar();
				if(dato != '['){
					pila.Apilar(dato);
				}
			}
			if (letra==')'){
				dato = pila.Desapilar();
				if(dato != '('){
					pila.Apilar(dato);
				}
			}
     }
	if(pila.EsVacia()){
		System.out.println("Esta balanceado");
	}else{
		System.out.println("No esta balanceado");
	}
  }
}


