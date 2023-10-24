public class TipoAutomovil {

    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoAutomovil(String nombre, int numeroPuerta, String descripcion) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

}
