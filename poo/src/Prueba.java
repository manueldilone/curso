public class prueba {

    public static void main(String[] args) {

        Persona per = new Persona("Arly");
        Automovil nisan = new Automovil("nissan", "TP", new Estanque());
        Automovil honda = new Automovil("nissan", "TP", new Estanque());

        boolean valor = nisan.equals(nisan);

        System.out.println(valor);

    }

}
