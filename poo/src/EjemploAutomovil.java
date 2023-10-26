public class EjemploAutomovil {

    public static void main(String[] args) {
        try 
{} 

catch
{}
        
        Automovil nissan = new Automovil("Nissan", "Versa", Color.GRIS);
        Automovil toyota = new Automovil("Toyota", "Camry", Color.ROJO);

        Motor motorHonda = new Motor(2.0, TipoMotor.GASOLINA);
        Estanque estanque = new Estanque();
        estanque.setCapacidad(55);
        toyota.setEstanque(estanque);
        Persona persona = new Persona("Fernando", "Serret", "Av. Winston Churchill");
        Rueda ruedass = new Rueda("Yokohama", 19, 22);
        Rueda[] rueda = new Rueda[4];
        /////////////////////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < rueda.length; i++) {

            rueda[i] = new Rueda("Yocohama Posicion:" + i, 20, 22);
        }

        toyota.setRuedas(rueda);

        for (Rueda rda : rueda) {

            System.out.println(rda.getFabricante());
            System.out.println(rda.getAro());
            System.out.println(rda.getAncho());
        }

        float consumo = toyota.getcalcularConsumo(13, 20);
        System.out.println(consumo);

    }

}
