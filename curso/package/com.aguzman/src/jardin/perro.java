package jardin;

import hogar.Persona;

public class perro {

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getRaza() {
        return raza;
    }

    protected void setRaza(String raza) {
        this.raza = raza;
    }

    private String nombre;
    private String raza;

    String jugar(Persona value){
        return value.getJugarPerro();
    }

    public String getSaludar(String value){
        return value;
    }
}
