public class Profesor extends Persona{
    private int sueldo;
    private Area areaLab;

    public Profesor() {
        super();
        this.areaLab = genRanArea();
        this.sueldo = genRanSueldo();
    }

    private int genRanSueldo(){ return RAN.nextInt(1900,2601);}

    private Area genRanArea() { return Area.values()[RAN.nextInt(Area.values().length)];}
    private enum Area {
        INGENIERIA,
        CIENCIAS_SALUD,
        CIENCIAS_JURIDICAS,
        ARTES_HUMANIDADES
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Area getAreaLab() {
        return areaLab;
    }

    public void setAreaLab(Area areaLab) {
        this.areaLab = areaLab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // Son la misma instancia
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return super.equals(profesor) &&
                this.areaLab == profesor.areaLab &&
                this.sueldo == profesor.sueldo;
    }

    @Override
    public String toString() {
        return "Profesor {" +
                super.toString() +
                ", Area laboral: " + areaLab +
                ", Sueldo: " + sueldo +
                '}';
    }
}
