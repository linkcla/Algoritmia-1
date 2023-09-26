import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double areaTotal = 0, perimetroTotal = 0;
        double [] areasT = new double[4], perimetrosT = new double[4];
        Random ran = new Random();
        //Cada una de las ArrayList que estan contenidas dentro del array representan la coleccion de objetos de cada
        //tipo (Circulo, Triangulo, Cuadrado, Rectangulo) en respectivo orden.
        ArrayList<Figura> [] figuras = new ArrayList[4];
        figuras[0] = new ArrayList<>();
        figuras[1] = new ArrayList<>();
        figuras[2] = new ArrayList<>();
        figuras[3] = new ArrayList<>();
        //Limite de los randoms a la hora de crear las figuras aleatorias.
        final int L = 100;

        for (int i = 0; i < 10000; i++) {
            int aux = ran.nextInt(4);
            switch (aux) {
                case 0 -> {
                    Figura c = new Circulo(ran.nextInt(L), ran.nextInt(L), ran.nextDouble(L));
                    figuras[0].add(c);
                    areasT[0] += c.area();
                    perimetrosT[0] += c.perimetro();
                    areaTotal += c.area();
                    perimetroTotal += c.perimetro();
                }
                case 1 -> {
                    Figura t = new Triangulo(ran.nextInt(L), ran.nextInt(L), ran.nextDouble(L), ran.nextDouble(L));
                    figuras[1].add(t);
                    areasT[1] += t.area();
                    perimetrosT[1] += t.perimetro();
                    areaTotal += t.area();
                    perimetroTotal += t.perimetro();
                }
                case 2 -> {
                    Figura c = new Cuadrado(ran.nextInt(L), ran.nextInt(L), ran.nextDouble(L));
                    figuras[2].add(c);
                    areasT[2] += c.area();
                    perimetrosT[2] += c.perimetro();
                    areaTotal += c.area();
                    perimetroTotal += c.perimetro();
                }
                default -> {
                    Figura r = new Rectangulo(ran.nextInt(L), ran.nextInt(L), ran.nextDouble(L), ran.nextDouble(L));
                    figuras[3].add(r);
                    areasT[3] += r.area();
                    perimetrosT[3] += r.perimetro();
                    areaTotal += r.area();
                    perimetroTotal += r.perimetro();
                }
            }
        }
        for (ArrayList<Figura> figura : figuras) {
            Collections.sort(figura);
        }


        System.out.println("La suma de las areas de todas las figuras es: " + areaTotal +"\n" +
                           "La suma de los perimetros de todas las figuras es: " + perimetroTotal + "\n" +
                           "--------La suma de las areas y perimetros por separado--------");
        System.out.println("\t * Circulo \n\t\tArea:" + areasT[0] + "\n\t\tPerimetro:" + perimetrosT[0]);
        System.out.println("\t * Triangulo \n\t\tArea:" + areasT[1] + "\n\t\tPerimetro:" + perimetrosT[1]);
        System.out.println("\t * Cuadrado \n\t\tArea:" + areasT[2] + "\n\t\tPerimetro:" + perimetrosT[2]);
        System.out.println("\t * Rectangulo \n\t\tArea:" + areasT[3] + "\n\t\tPerimetro:" + perimetrosT[3]);
    }
}