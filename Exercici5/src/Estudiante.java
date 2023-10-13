public class Estudiante extends Persona {

    private Programa programa;
    private Curso curso;
    private int cuota;

    public Estudiante() {
        super();
        this.programa = genRanProg();
        this.curso = genRanCurso();
        this.cuota = RAN.nextInt(800,1501);
    }

    private Curso genRanCurso() { return Curso.values()[RAN.nextInt(Curso.values().length)];}

    private Programa genRanProg() { return Programa.values()[RAN.nextInt(Programa.values().length)];}


    private enum Programa {
        INFORMATICA,
        INDUSTRIAL,
        MATEMATICAS,
        ENFERMERIA,
        PSICOLOGIA,
        HISTORIA,
        DERECHO

    }

    private enum Curso {
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
               this.programa == estudiante.programa &&
               this.curso == estudiante.curso &&
               this.cuota == estudiante.cuota;
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
