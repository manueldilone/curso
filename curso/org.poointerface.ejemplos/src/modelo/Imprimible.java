package modelo;

public interface Imprimible {

    String TEXTO_CONST="Imprimiendo un valor por Defecto de la Interface";

    default String imprimir(){
        return TEXTO_CONST;
    }

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
