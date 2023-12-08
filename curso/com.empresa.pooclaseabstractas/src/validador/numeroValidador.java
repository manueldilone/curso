package validador;

public class numeroValidador extends validador{

    protected String mensaje = "el campo %s debe ser un número";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;

    }

    @Override
    public boolean esValido(String valor) {
        try {

            Integer.parseInt(valor);


            return true;
        }
        catch (NumberFormatException e){
            return false;

        }
    }
}
