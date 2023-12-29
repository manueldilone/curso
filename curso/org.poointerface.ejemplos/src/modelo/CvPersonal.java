package modelo;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.List;

public class CvPersonal extends Hoja implements Imprimible {

private Persona persona;
private String  carrera;
private List<String> exprenciaLaboral;



    public CvPersonal(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.exprenciaLaboral = new ArrayList<>();

    }


public CvPersonal addExperencia(String exp){
    exprenciaLaboral.add(exp);
    return this;
}


    @Override
    public String imprimir() {

StringBuilder sb = new StringBuilder("Nombre:");
                sb.append(persona.getNombre()).append("\n")
                    .append("Resumen: ").append(this.contenido)
                    .append("\n Profesión: ").append(this.carrera).append("\n")
                    .append("Expereiencia : \n");

                    for (String impresion: this.exprenciaLaboral){
                    sb.append(" - ").append(impresion).append("\n");

                    }

return sb.toString();


    }


}
