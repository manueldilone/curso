import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String [] Empleados = {"Andres","Juan","Maria","Paco","Lalo","Bea","Pato","Pepa","Pepe"};

        String [] nombre = Empleados;
        int count=nombre.length;



        double [] valor= {100.00,1000.00,300000.00};

        for (int i =0; i < count; i++){
   if (nombre[i].toLowerCase().contains("ANDRES".toLowerCase()) || nombre[i].toLowerCase().contains("pePA".toLowerCase()))
            {
               System.out.println(i + ".- " + nombre[i]);
            }

            }


        String buscar = JOptionPane.showInputDialog("Ingrese un Nombre, Ejemplo Pepe o Maria");
      //  System.out.println("buscar = "+buscar);

        boolean encontrado = false;

for(int i=0; i<= count; i++)
{
   if(nombre[i].equalsIgnoreCase(buscar)){
       encontrado = true;
       System.out.println(i + ".- nombres = " + nombre[i]);

   }

   if(encontrado)
   {
       JOptionPane.showMessageDialog(null,buscar + " Fue contrado!");
       break;
   }





}





        }




    }

