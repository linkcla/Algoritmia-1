import java.util.Objects;

public class Persona {
    private String nombre;
    private String direccion;

    public Persona(String Nombre, String Direccion) {
        this.nombre = Nombre;
        this.direccion = Direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; // Son la misma instancia
        }

        if (o == null || getClass() != o.getClass() ) {
            return false;
        }
        Persona persona = (Persona) o;

        return this.nombre.equals(persona.getNombre()) &&
               this.direccion.equals(persona.getDireccion());
    }

    @Override
    public String toString() {
        return (
                "Nombre: "+ nombre +
                ", Direccion: "+ direccion
                );
    }
}
