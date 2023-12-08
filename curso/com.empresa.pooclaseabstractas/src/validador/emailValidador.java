package validador;

public class emailValidador extends validador{

    protected String mensaje = "el campo %s tiene un formato de correo inválido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";
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
        return valor.matches(EMAIL_REGEX);
    }


}
