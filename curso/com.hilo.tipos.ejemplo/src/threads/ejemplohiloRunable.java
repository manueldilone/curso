package threads;

public class ejemplohiloRunable {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        Runnable viaje= ()->{
            for(int i=0; i<5; i++)
            {
                System.out.println( i + "-"+Thread.currentThread().getName());
                try
                {
                  //  Thread.sleep( 10000 );
                }
                catch (Exception e)
                {
                    System.out.println(e.toString());
                }
            }
            System.out.println("Finalizo el viaje a : "+ Thread.currentThread().getName());
        };
        Thread v1= new Thread(viaje,"Isla Beata");
        v1.start();
        System.out.println("GetName:"+ v1.getName());
        System.out.println("TosTring :" +v1.toString());
        System.out.println(v1.getId());
        System.out.println(v1.getPriority());
        System.out.println(v1.hashCode());
        System.out.println("Contiando la con la ejecucion del Thread Main:" + main.getName());
    }
}


