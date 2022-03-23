package Ejer1;


public class SumaEntreNums{
public static void elfor (int a, int b) {
    for (int i = a; i <= b; i++) {
        System.out.println(i);
    }
}
public static void elwhile (int a, int b) {
    while (a <= b) {
        System.out.println(a);
        a++;
    }
}

public static void sin (int a, int b) {
    if (a<=b) {
        System.out.println(a);
        sin(a+1,b);
    }
 }


public static void main (String []args){
        
        elfor(1, 5);
        elwhile(5, 11);
        sin(7, 18);
    }
}
