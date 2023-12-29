package validador;

abstract public class validador {

    private String mensaje;
    abstract void setMensaje(String mensaje);
    abstract String getMensaje();
    abstract boolean vesValido(String valor);

}
