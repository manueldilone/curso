public class sentenciasIF_Else {

    public static void main(String[] args) {

        float promedio = 10.0f;

        if (promedio >= 6.5) {

            System.out.println("Felicitaciones, Excelente promedio!");

        } else if (promedio >= 6.0) {
            System.out.println("Muy Buen Promedio!");
        } else if (promedio >= 5.5) {
            System.out.println(" Buen Promedio");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesita estudiar");

        }

        else {
            System.out.println("Reprobado");
        }

        System.out.println("tu Promedio es " + promedio);

    }

}
