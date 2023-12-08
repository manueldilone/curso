package validador;

public class noNuloValidador extends validador{

    private String mensaje = "el Campo %s no puede ser nulo";
    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;

    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}
