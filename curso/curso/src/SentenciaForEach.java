import javax.swing.*;

public class SentenciaForEach {

    public static void main(String[] args) {

        String buscar = JOptionPane.showInputDialog("Ingrese un Nombre, Ejemplo Pepe o Maria");
        String[] nombre = {"Andres", "Juan", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa", "Pepe"};
        for (String nom : nombre) {

            if (nom.equalsIgnoreCase(buscar)) {

                System.out.println("nombres = " + nom);
                break;
            }



        }

        int [] numeros = {1,3,5,7,9,11,13,15,2,4,6,8,10,12,14,16};
        for(int numero:numeros){
           if(numero%2==0){
               System.out.println("Si es Par" + numero);

           }
        }


    }
}