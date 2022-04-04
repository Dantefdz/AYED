package Cola_Pila;
import ListaEnlazada.ListaEnlazadaGenerica.ListaEnlazadaGenerica;;

public class PilaGenerica<T>  {
    private ListaEnlazadaGenerica<T> datos = new ListaEnlazadaGenerica<T>();

	 public void  Apilar(T dato){
		this.datos.agregarInicio(dato);
    }
    public T tope(){
    	this.datos.comenzar();
    	T elem = datos.elemento(1);
    	return elem;
    }
    public T  Desapilar(){
    	T elem = datos.elemento(1);
        this.datos.eliminarEn(1);
        return elem;
    }
    public boolean EsVacia(){
    	return this.datos.esVacia();
    }
}
