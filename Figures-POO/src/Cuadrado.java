public class Cuadrado extends Rectangulo{
    /**
     * Constructor de la clase que permite crear nuevas instancias de Cuadrados.
     * @param lado longitud del lado
     */
    public Cuadrado(double lado) {
        super(lado,lado);
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
