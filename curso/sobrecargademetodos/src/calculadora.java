public class calculadora {


    public int sumar(int a, int b){
        return a+b;
    }

    public float sumar(int i, float j)
    {
        return i + j;
    }

    public double sumar(double a, double b){
        return a+b;
    }
    public int sumar(String a, String b){
        int resultado;

        try{


            resultado =  Integer.parseInt(a) + Integer.parseInt(b);



        }
        catch (NumberFormatException e) {
            resultado= 0;

            System.out.println("Algo Fallo : " + e );

        }




       return resultado;
    }

            public int sumar(int a, int b, int c){
        return a+b+b;
            }
}
