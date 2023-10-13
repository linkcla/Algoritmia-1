public class Profesor extends Persona{
    private int sueldo;
    private Area areaLab;

    public Profesor(String nombre, String direccion, Area areaLab, int sueldo) {
        super(nombre,direccion);
        this.areaLab = areaLab;
        this.sueldo = sueldo;
    }


    public enum Area {
        INGENIERIA,
        CIENCIAS_SALUD,
        CIENCIAS_JURIDICAS,
        ARTES_HUMANIDADES,
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
        return super.equals(o) &&
                this.areaLab == profesor.getAreaLab() &&
                this.sueldo == profesor.getSueldo();
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
