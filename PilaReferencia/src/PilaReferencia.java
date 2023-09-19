public class PilaReferencia<E> {
    public Nodo<E> top;

    public PilaReferencia(){ this.top = null;}

    public E pop() throws PilaSinElementos{
        if (top == null){
            throw new PilaSinElementos();
        }else {
            //La pila tiene elementos
            E valor = top.getValor();
            top = top.getNext();

            return valor;
        }
    }

    public void push (E elemento){
        Nodo<E> aux = new Nodo<E>(elemento);
        aux.setNex(top);
        top = aux;
    }

    public E top() {return top.getValor();}



    public static class PilaSinElementos extends Exception{
        public PilaSinElementos (){
            System.out.println("Error, pila sin elementos.");
        }
    }
}
