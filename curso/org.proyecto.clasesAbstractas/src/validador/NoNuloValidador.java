package validador;

public class NoNuloValidador  extends validador{
    private String mensaje = "el campo %s no puede ser nulo";

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

        return (!valor.isEmpty());
    }
}
