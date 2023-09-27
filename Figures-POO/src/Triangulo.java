public class Triangulo extends Figura{
    private double b;
    private double h;

    /**
     * Permite contruir instancias de la clase Triangulo
     * @param base longitud de la base del triangulo
     * @param altura longitud de la altura del triangulo
     */
    public Triangulo(double base, double altura){
        this.b = base;
        this.h = altura;
    }

    @Override
    public double area() {
        return (b*h)/2.0;
    }

    @Override
    public double perimetro() {
        double lado = Math.sqrt(Math.pow(b/2,2) + Math.pow(h,2));
        return (2 * lado + b);
    }

    @Override
    public int compareTo(Figura f) { return (int) (this.area() - f.area()); }

    @Override
    public String toString(){
        return ("Trianculo con base: " + b + ", altura: " + h + ", area = " + area() + " y perimetro: " + perimetro());
    }
}
