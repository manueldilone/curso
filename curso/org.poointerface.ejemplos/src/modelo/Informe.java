package modelo;

public class Informe extends Hoja implements Imprimible{

    private Persona Autor;
    private Persona Editor;

    public Informe(String contenido, Persona autor, Persona editor) {
        super(contenido);
        this.Autor = autor;
        this.Editor = editor;

    }



    @Override
    public String imprimir() {
        return "Informe escrito por: "+Autor.getNombre()
        + " Impreso por la Editora :"+ Editor.getNombre()
        + "\n "+this.contenido;


    }



}
