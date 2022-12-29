public class MainThread {
    public static void main(String[] args) {
        System.out.println("1");

        new Thread(()-> {

               for(int i = 0; i < 5; i ++){
                   try{
                       Thread.sleep(100);
                       System.out.println(Thread.currentThread().getName() +":"+ i);

                   } catch (InterruptedException e){
                       e.printStackTrace();
                   }
               }

        }).start();



        System.out.println("2");
    }
}
