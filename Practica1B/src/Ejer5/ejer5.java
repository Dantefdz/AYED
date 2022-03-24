package Ejer5;

public class ejer5 {
    public static Datos conReturn(int[] w) {
   	 int a = 99999,b = -1,c = 0;
   	 for(int j:w) {
   		 if(j < a) {
   			 a = j;
   		 }
   		 if(j > b) {
   			 b = j;
   		 }
   		 c += j;
   	 }
   	 c = c / w.length;
   	 Datos s = new Datos();
   	 s.setMax(b);
   	 s.setMin(a);
   	 s.setPro(c);
   	 return s;
    }
    public static void conParam(int[] w,Datos s) {
   	 int a = 99999,b = -1,c = 0;
   	 for(int j:w) {
   		 if(j < a) {
   			 a = j;
   		 }
   		 if(j > b) {
   			 b = j;
   		 }
   		 c += j;
   	 }
   	 c = c / w.length;
   	 s.setMax(b);
   	 s.setMin(a);
   	 s.setPro(c);
    }
    
}
