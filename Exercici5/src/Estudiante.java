public class Estudiante extends Persona {

    private Programa programa;
    private Curso curso;
    private int cuota;

    public Estudiante(String nombre, String direccion, Programa programa, Curso curso, int cuota) {
        super(nombre, direccion);
        this.programa = programa;
        this.curso = curso;
        this.cuota = cuota;
    }


    public enum Programa {
        INFORMATICA,
        INDUSTRIAL,
        MATEMATICAS,
        ENFERMERIA,
        PSICOLOGIA,
        HISTORIA,
        DERECHO

    }

    public enum Curso {
        PRIMERO,
        SEGUNDO,
        TERCERO,
        CUARTO
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // Son la misma instancia
        }

        if (o == null || getClass() != o.getClass() ) {
            return false;
        }
        Estudiante estudiante = (Estudiante) o;
        return super.equals(o) &&
               this.programa == estudiante.getPrograma() &&
               this.programa == estudiante.programa &&
               this.cuota == estudiante.getCuota();
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                super.toString() +
                ", Programa: " + programa +
                ", Curso: " + curso +
                ", Cuota: " + cuota +
                '}';
    }
}
