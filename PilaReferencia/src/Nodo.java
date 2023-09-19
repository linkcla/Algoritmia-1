public class Nodo<E> {
    private Nodo<E> next;
    private E valor;

    public Nodo (E elemento){
        this.valor = elemento;
    }

    public void setNex (Nodo<E> next){
        this.next = next;
    }

    public Nodo<E> getNext (){ return next; }

    public E getValor(){ return valor; }
}
