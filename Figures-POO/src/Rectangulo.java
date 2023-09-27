public class Rectangulo extends Figura{
    private double h;
    private double b;

    /**
     * Permite crear instancias de la clase Rectangulo
     * @param h
     * @param b
     */
    public Rectangulo(double h, double b) {
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

    /**
     * Metodo toString para la clase {@link Rectangulo}
     * @return el objeto de la clase {@link Rectangulo} convertido a String
     */
    @Override
    public String toString(){
        return ("Rectangulo con base: " + b + ", altura: " + h + ", area = " + area() + " y perimetro: " + perimetro());
    }
}
