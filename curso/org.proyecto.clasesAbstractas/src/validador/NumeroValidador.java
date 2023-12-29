package validador;

public class NumeroValidador extends validador{
    private String mensaje = "el campo %s debe ser un numero";
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
        try{
            Integer.parseInt(valor);
            return true;

        }
        catch (Exception e){
         return false;
        }
    }
}
