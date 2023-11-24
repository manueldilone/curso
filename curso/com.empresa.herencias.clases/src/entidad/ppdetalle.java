package entidad;

public class ppdetalle extends pp{


    @Override
    public void MiPadreSaludar() {
        System.out.println("Hola");
    }

    @Override
    public void modificarRegistro() {
        System.out.println("soy Modificador");
    }

    @Override
    public void BorrarRegistro() {
        System.out.println("Borrando Registro");

    }

    @Override
    public void GuardarRegistro() {
        System.out.println("Guardando Registro");


    }
}
