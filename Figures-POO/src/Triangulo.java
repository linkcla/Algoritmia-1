public class Triangulo extends Figura{
    private double b;
    private double h;

    public Triangulo( int x, int y, double base, double altura){
        super(x,y);
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
