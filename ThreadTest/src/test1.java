public class test1 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("myThread");
        myThread.start();
        Thread thread=new Thread(new MyRun(),"myRun");
        thread.start();
        while (true){
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis()/1000+"    "+Thread.currentThread().getName());

        }
    }
}
