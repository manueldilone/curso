import javax.swing.JOptionPane;

public class pruebaFor {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

        }
String nombres
        String[] nombre = { "Andres", "Juan", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa", "Pepe" };
        for (String nom : nombre) {

            System.out.println("nombres = " + nom);

        }

        int[] numeros = { 1, 3, 5, 7, 9, 11, 13, 15, 2, 4, 6, 8, 10, 12, 14, 16 };
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Si es Par" + numero);

            }
        }

    }
}