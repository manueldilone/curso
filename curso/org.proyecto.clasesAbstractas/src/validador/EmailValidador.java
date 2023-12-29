package validador;

public class EmailValidador extends validador{
    private String mensaje = "el campo %s tiene un formato de correo invalido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";
    @Override
    void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    String getMensaje() {
        return mensaje;
    }

    @Override
    boolean vesValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
