import java.util.Random;

public class Persona {
    private String nombre;
    private String direccion;

    public static final Random RAN = new Random();

    public Persona() {
        this.nombre = generateRandomStrings();
        this.direccion = generateRandomStrings();
    }

    private String generateRandomStrings() {
        // El profesor dijo que para generar los nombres y las direcciones
        // podiamos crear Strings aleatorios.
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < RAN.nextInt(4,8); i++) {
            name.append((char) RAN.nextInt(97,123));
        }
        return name.toString();
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

        return this.nombre.equals(persona.nombre) &&
               this.direccion.equals(persona.direccion);
    }

    @Override
    public String toString() {
        return (
                "Nombre: "+ nombre +
                ", Direccion: "+ direccion
                );
    }
}
