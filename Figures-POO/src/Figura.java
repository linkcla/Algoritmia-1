public abstract class Figura implements Comparable<Figura> {
    private int x;
    private int y;

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public int compareTo(Figura f) {
        return (int) (this.area() - f.area());
    }
}
