public class Main {
    public static void main(String[] args) {
        //
        PilaReferencia<Integer> pila = new PilaReferencia<Integer>();
        pila.push(0);
        try {
            int i = pila.pop();
        } catch (PilaReferencia.PilaSinElementos e) {
            // si se quiere se puede poner e.printStackTrace();
        }
    }
}