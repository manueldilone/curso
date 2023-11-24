package entidad;

public class alumno extends personas{

    private String institucion;
    private Double notaMatematica;

    private Double notadeHistoria;
    private Double notaCastellano;




    public alumno(){
        System.out.println("Disparo constructor de Alumno ");

    }
    public alumno(String nombre, String apellido){
        super(nombre,apellido);
    }
    public alumno(String nombre, String apellido, int edad){
        super(nombre,apellido,edad);
    }
    public alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre,apellido,edad);
        this.institucion=institucion;
    }
    public alumno(String nombre, String apellido, int edad, String institucion, double notaMatematica, double valdeHist, double notaCastellano){

        super(nombre,apellido,edad);

        this.institucion=institucion;
        this.notaMatematica=notaMatematica;
        this.notadeHistoria=valdeHist;
        this.notaCastellano=notaCastellano;

    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(Double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public Double getNotadeHistoria() {
        return notadeHistoria;
    }

    public void setNotadeHistoria(Double notadeHistoria) {
        this.notadeHistoria = notadeHistoria;
    }

    public Double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(Double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    @Override
public String saludar(){
        return super.saludar() + " soy un alumno y mi padre es " + super.getNombre();
}


public Double calcularPromedio(){

        return  (notadeHistoria+notaMatematica+notaCastellano) / 3 ;
}






}
