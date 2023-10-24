public class Persona {

    private static String nombre;
    private static String apellido;
    private static String direccion;

    Persona() {
    }

    Persona(String nom) {
        nombre = nom;

    }

    Persona(String nom, String Apell) {
        nombre = nom;
        apellido = Apell;
    }

    Persona(String nom, String Apell, String dir) {

        nombre = nom;
        apellido = Apell;
        direccion = dir;
    }

    public String getInformacion() {

        StringBuilder sb = new StringBuilder(getNombre());
        sb.append(" ").append(getApellido()).append(" ").append(getDireccion());
        return sb.toString();

    }

    public void setNombre(String nom) {

        nombre = nom;
    }

    public void setApellido(String apel) {
        apellido = apel;
    }

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
