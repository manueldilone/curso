package validador;

 public abstract class validador {
    protected String mensaje;
    abstract public String getMensaje();

    abstract  public void setMensaje(String mensaje);
    abstract public boolean esValido(String valor);


}
