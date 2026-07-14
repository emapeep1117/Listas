import java.util.Iterator;
import java.util.NoSuchElementException;

public class PilaLinked <E> implements Pila <E>{

 private final Lista<E> elementos;
 public PilaLinked (){
    elementos= new LinkedList<>();
 }
 @Override
 public void apilar(E e){
    elementos.agregarFinal(e);
 }
@Override
 public E desapilar(){
    if (esVacia()) {
            throw new NoSuchElementException(
                "La pila está vacía"
            );
        }

        return elementos.eliminarElementoFinal();
 }
@Override
public E consultarCima(){
   if (esVacia()) {
            throw new NoSuchElementException(
                "La pila está vacía"
            );
   }
   int ultimaPosicion=elementos.numElementos()-1;
   return elementos.consultar(ultimaPosicion);

}
@Override
public boolean esVacia(){
    return elementos.esVacia();
}

@Override
public int numElementos(){
    return elementos.numElementos();
}
public void limpiar(){
    return elementos.limpiarLista();
}

@Override
    public Iterator<E> iterator() {
        return elementos.iterator();
    }

}
