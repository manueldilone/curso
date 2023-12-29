package validador;

public class requeridoValidador extends  validador{
    private String mensaje = "el campo %s es requerido";

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
