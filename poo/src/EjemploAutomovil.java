public class EjemploAutomovil {

    public static void main(String[] args) {
        Estanque estanquetoyota = new Estanque();
        Automovil honda = new Automovil("Honda", "Accord", estanquetoyota);
        persona conductorhonda = new Persona("Nombre", "", "");

        estanquetoyota.setCapacidad(100);
        Estanque estanqueHonda = new Estanque();
        estanqueHonda.setCapacidad(50);

        Automovil nissan = new Automovil("Nissan", "Versa", new Estanque());

        Automovil toyota = new Automovil("Toyota", "Camry", estanquetoyota);

        // estanque.setCapacidad(40);

        System.out.println(honda.verDetalle());
        System.out.println(toyota.verDetalle());

        Motor motorHonda = new Motor(2.0, TipoMotor.GASOLINA);

        Persona persona = new Persona("Fernando", "Serret", "Av. Winston Churchill");

        // honda.setMotor(motorHonda);
        // honda.setEstanque(estanque);
        // honda.se

        System.out.println(honda.verDetalle());

    }

}
