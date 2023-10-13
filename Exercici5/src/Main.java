public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("a","e", Estudiante.Programa.DERECHO, Estudiante.Curso.PRIMERO,1);
        Estudiante e2 = new Estudiante("a","e", Estudiante.Programa.DERECHO, Estudiante.Curso.PRIMERO,1);
        System.out.println(e1.equals(e2));
    }
}