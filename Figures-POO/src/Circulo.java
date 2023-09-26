public class Circulo extends Figura{
    private double r;

    public Circulo(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.pow(r, 2) * Math.PI;
    }

    @Override
    public double perimetro() {
        return Math.PI * r * 2;
    }

    @Override
    public int compareTo(Figura f) {
        return (int) (this.area() - f.area());
    }

    @Override
    public String toString(){
        return ("Circulo con radio: " + r + ", area = " + area() + " y perimetro: " + perimetro());
    }
}
