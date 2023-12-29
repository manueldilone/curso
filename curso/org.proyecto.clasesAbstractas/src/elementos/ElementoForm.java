package elementos;
import validador.validador;

import javax.xml.validation.Validator;
import java.util.List;

abstract public class ElementoForm {
     protected String  Valor;
     protected String nombre;
     private List<validador> Validadores;
     private List<String> errores;

     public ElementoForm(){

     }

  public ElementoForm addValidador(validador value) {
        this.Validadores.add(value);
         return this;
  } 

}
