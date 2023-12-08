import java.util.List;
import validador.validador;
public class elementoForm {

    protected String nombre;
    protected String valor;
    public List<validador> validadores;
    public List<String>errores;




    public elementoForm addValidador(validador valor){
        validadores.add(valor);
        return this;

    }

    public boolean esValido(){
        for (validador v: validadores){
            if(!v.esValido(this.valor)){

            }
        }

    }





}