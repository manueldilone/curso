import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemplosJavaUtilDate {
    @Deprecated
    public static void main(String[] args) {
        Date ffecha = new Date();
int j=0;
long inicialiacion = ffecha.getTime();
for(int i=0; i <10000000; i++ ){
    j+=i;
}
long finalizacion = ffecha.getTime();

long datofinal = finalizacion - inicialiacion;
        System.out.println(datofinal);


        SimpleDateFormat dfH = new SimpleDateFormat("h:mm a");
        SimpleDateFormat dfFC = new SimpleDateFormat("dd-MM-yyyy");

        String fetchStr = dfH.format(ffecha);
        String fetchStrS = dfFC.format(ffecha);
        System.out.println(fetchStr);
        System.out.println(fetchStrS);



    }



}
