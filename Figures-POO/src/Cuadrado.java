public class Cuadrado extends Rectangulo{
    public Cuadrado(int x, int y, double lado) {
        super(x,y,lado,lado);
    }

    @Override
    public double area() {
        double lado = super.getH();
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return 4*super.getH();
    }

    @Override
    public int compareTo(Figura f) { return (int) (this.area() - f.area()); }

    @Override
    public String toString(){
        return ("Cuadrado con lado: " + super.getH() + ", area = " + area() + " y perimetro: " + perimetro());
    }
}
