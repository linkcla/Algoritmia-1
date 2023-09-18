import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> elementos = new ArrayList<>();

        System.out.print("Introduce el numero de elementos que quieres que tenga el conjunto: ");
        int cantElementos = sc.nextInt();

        //Inicializamos una lista de elementos (enteros) de forma random

        for (int i = 0; i < cantElementos; i++) {
            elementos.add(ran.nextInt(20000));
        }
        // Ordenamos la lista
        Collections.sort(elementos);

        System.out.println("Lista creada.");


        //Pedimos que introduzca el elemento que quiere buscar
        System.out.println("¿Qué elemento quieres buscar?");
        int elemento = sc.nextInt();

        //Busca el elemento en la lista.
        int pos = busquedaBinaria(elementos, elemento);

        //Si el elemento no esta en el conjunto --> pos < 0
        if (pos != -1) {
            System.out.println("El elemento se encuentra en la posición: " + pos);
        } else {
            System.out.println("El elemento no se encuentra en el conjunto");
        }
    }

    private static int busquedaBinaria(ArrayList<Integer> elementos, int elemento){
        //Busca el elemento en la lista.
        int bajo = 0;
        int alto = elementos.size();
        int indice;
        while (alto > bajo){
            indice = (int)(alto + bajo)/2;
            if (elemento == elementos.get(indice)){
                //Ha encontrado el elemento
                return indice;
            }
            if (elemento > elementos.get(indice)){
                bajo = indice;
            } else if (elemento < elementos.get(indice)){
                alto = indice;
            } else {
                //No ha encontrado el elemento bajo > alto
                break;
            }
        }
        return -1;
    }
}


