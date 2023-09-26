public class Rectangulo extends Figura{
    private double h;
    private double b;

    public Rectangulo(int x, int y, double h, double b) {
        super(x, y);
        this.h = h;
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public double getB() {
        return b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return b * h;
    }

    @Override
    public double perimetro() {
        return (b * 2) + (h * 2);
    }

    @Override
    public int compareTo(Figura f) {
        return (int) (this.area() - f.area());
    }

    @Override
    public String toString(){
        return ("Rectangulo con base: " + b + ", altura: " + h + ", area = " + area() + " y perimetro: " + perimetro());
    }
}
