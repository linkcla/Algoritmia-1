

public class PilaArray {
    private int pila [];
    private int top;

    public PilaArray(int length){
        pila = new int[length];
        top = -1;
    }
    public int pop () throws PilaSinElementos {
        if (top == -1) {
            throw new PilaSinElementos();
        }else {
            return pila[top--];
        }
    }

    public void push (int elemento) throws PilaLlena {
        if ((top +1) == pila.length) {
            throw new PilaLlena();
        }else {
            pila[++top] = elemento;
        }
    }
    public int top() {
        return pila[top];
    }

    private static class PilaSinElementos extends Exception{
        public PilaSinElementos (){
            System.out.println("Error, la pila no tiene elementos para extraer.");
        }
    }

    private static class PilaLlena extends Exception{
        public PilaLlena(){
            System.out.println("Error, la pila esta llena.");
        }
    }
}
