

public class sentenciaFor {
    public static void main(String[] args) {



        for (int i = 0; i <= 10; i++) {

            System.out.println("i + " + i);
        }

        for (int i = 10; i >= 0; i--) {

            System.out.println("i - Decr " + i);
        }



        for (int i = 0; i <= 10; i++) {

            if ((i % 2 == 0)) {
                System.out.println("i Es numero par =" + i);
                continue;
            }


            System.out.println("i es Numero impar=" + i);

        }


    }

}
