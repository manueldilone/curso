public class SentenciasWhile {
    public static void main(String[] args) {

        boolean isvof = true;
        int i =0;
       while (i<=5)
        {
            System.out.println("i = " + i);


            i++;
        }

       i=0;
       boolean prueba = true;

       while (prueba){
           if(i==7){
               System.out.println("i = " + i);
               prueba = false;
           }

           i++;
       }

i=0;
       prueba = false;

       do {
           System.out.println("se Ejecuta al menos una vez");
           i++;
       }
       while (i<5);

    }
}



