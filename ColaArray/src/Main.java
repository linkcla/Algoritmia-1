import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la pila: ");
        PilaArray p = new PilaArray(scanner.nextInt());
        // Usar metodos push, pop y top para tratar con la pila teniendo en cuenta que hay throws
    }
}