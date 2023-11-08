package jardin;

import hogar.ColorPelo;
import hogar.Persona;
import static hogar.Persona.getSaludar;

public class ejemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Juan");
        p.setApellido("Perez");
        p.setColorPelo(ColorPelo.CAFE);
        System.out.println(p.getNombre());

        perro perro = new perro();
        perro.setRaza("puder");
        perro.setNombre("toby");
        System.out.println(perro.getNombre());

        String jugando = perro.jugar(p);
        System.out.println("juando:" + jugando);

        String saludarperro = perro.getSaludar("Hola perro");
        System.out.println(saludarperro);


        String saludo = getSaludar();
        System.out.println("Saludos Metodo Static de Persona:" + saludo);





    }

}
