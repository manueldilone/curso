package entidad;

public class profesor extends personas{
    private String asignatura;

    public profesor(){
        System.out.println("Profesor inicializado sin el super... via arly");
    }
    public profesor(String nombre, String apellido){
        super(nombre, apellido);
        System.out.println("Profesor inicializado con el super... con nombre y apellido");
    }
    public profesor(String nombre, String apellido, int edad, String asignatura){

        super(nombre, apellido,edad);
        this.asignatura=asignatura;
        System.out.println("Profesor inicializado con el super... con nombre , apellido,edad  y asignatura");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    @Override
    public String saludar(){
        return "Buenos dias soy el profesor de la asignatura "+asignatura + ", mi nombre es "+super.getNombre();
    }

    @Override
    public String toString(){

        return super.toString() + "\nAsignatura="+asignatura;
    }



}
