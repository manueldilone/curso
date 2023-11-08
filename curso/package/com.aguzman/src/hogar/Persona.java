package hogar;

public class Persona {

    private String nombre;
    private String apellido;
    private String direccion;

    private ColorPelo colorPelo;


    public static final String GENERO_MASCULINO = "Masculino";
    public static final String nombref = "Femenino";


    public static String getSaludar(){
        return "hola que tal!";
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }





    public String getJugarPerro(){
        return "Lanzar la pelota al Perro";
    }





}
