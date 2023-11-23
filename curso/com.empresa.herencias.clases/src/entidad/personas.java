package entidad;

public class personas {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

public personas(){
    System.out.println("Persona: Constructor vacio inicialiado Correctamente...");
    System.out.println("borro datos ");
    System.out.println("llamo fernando");
}

    public personas(String nombre, String apellido){

    this.nombre=nombre;
    this.apellido=apellido;

        System.out.println("Persona: Iniciado Correctamente... con Nombre y Apellido");
    }
    public personas(String nombre, String apellido, int edad){

        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        System.out.println("Persona: Iniciado Correctamente... con Nombre, Apellido y Edad");
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String saludar(){
    return "Hola que Tal!";
    }

    @Override
    public String toString(){

    return  "Nombre ="+nombre +
            "\nAplellido="+apellido+
            "\nEdad="+edad+
            "\nEmail="+ email +
            "\nSaludos ="+saludar();



    }


}
