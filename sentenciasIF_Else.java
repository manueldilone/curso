public class sentenciasIF_Else {

    public static void main(String[] args) {
        String Mensajes = null;

        float promedio = 10.0f;

        if (promedio >= 6.5) {

            Mensajes = "Felicitaciones, Excelente promedio!";

        } else if (promedio >= 6.0) {
            System.out.println("Muy Buen Promedio!");
        } else if (promedio >= 5.5) {
            Mensajes = " Buen Promedio";
        } else if (promedio >= 4.0) {
            Mensajes = "Insuficiente, necesita estudiar";

        }

        else {
            Mensajes = "Reprobado";
        }

        System.out.println(Mensajes);

        System.out.println("tu Promedio es " + promedio);

    }

}
