import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        int numPers = 1000000;
        int tipoPers;
        for (int i = 0; i <= numPers; i++) {
            tipoPers = ran.nextInt(2);
            switch (tipoPers) {
                case 0 -> { Estudiante e = new Estudiante();}
                case 1 -> { Profesor p = new Profesor();}
            }
        }
    }
}