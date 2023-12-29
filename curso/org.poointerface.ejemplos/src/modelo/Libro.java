package modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
    private List<Imprimible>paginas;
    private Persona autor;
    private String titulo;
    private String genero;

    public Libro(Persona autor, String titulo, String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;

        this.paginas = new ArrayList<>();
    }

public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
}

@Override
public String imprimir(){
        StringBuilder sb =  new StringBuilder("Tutilo: ");
        sb.append(this.titulo)
                .append("\n")
                .append("Autor: ")
                .append(this.autor)
                .append("\n")
                .append("genero: ")
                .append(this.genero)
                .append("\n");

        for (Imprimible nombrepagina: paginas){

            sb.append(" - ").append(nombrepagina).append("\n");

        }
        return sb.toString();

}


}
