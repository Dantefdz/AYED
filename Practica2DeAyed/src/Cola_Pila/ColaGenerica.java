package Cola_Pila;
import ListaEnlazada.ListaEnlazadaGenerica.ListaEnlazadaGenerica;;

public class ColaGenerica<T> {
      private ListaEnlazadaGenerica<T> datos = new ListaEnlazadaGenerica<>();
      public void encolar(T elem){
    	  this.datos.agregarFinal(elem);
      }
      public T tope(){
    	  T elem = datos.elemento(1);
    	  return elem;
      }
      public T desencolar(){
    	  T elem = datos.elemento(1);
    	  datos.eliminarEn(1);
    	  return elem;
      }
      public boolean EsVacia(){
    	  return this.datos.esVacia();
      }
}

