import modelo.*;
import static modelo.Imprimible.*;


public class ejemploImprenta {

    public static void main(String[] args) {

        String contenido = "Resumen cv y Experiencia Laboral..";
        Persona autor = new Persona("Tulio", "Mercedes");

        CvPersonal cv = new CvPersonal(autor, "Ingenieria de Software", contenido);

        cv.addExperencia("Programador Java")
                .addExperencia("Programador C#")
                .addExperencia("Programador C")
                .addExperencia("Programador Python")
                .addExperencia("Programador XXX");


        Libro libro = new Libro(autor, "Patrones de Diseños Reusable POO", "Porgramacion");
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"));


        Informe info = new Informe(contenido, autor, new Persona("Arly", "Fernando"));
        imprimir(cv);
        imprimir(info);

        imprimir(libro);

        System.out.println(libro.imprimir());

        System.out.println(TEXTO_CONST);
    }


}
