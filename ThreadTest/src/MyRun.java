/**
 * @author cheng
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
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
