import java.io.*;

public class test {
    public static void main(String[] args) {
//        File file =new File("e://aaaaa.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("12356");
//        }
        InputStream is=null;
        OutputStream os=null;
        try {
            //e://winform/timer.wmv
            File file=new File("e://winform/timer.wmv");

            is=new FileInputStream("e://winform/timer.wmv");
            os=new FileOutputStream("e://tt/b/timer.wmv");
            long length=file.length();
            int per=1024*20;
            System.out.println(per+"----"+length);
            long completed=0L;
            double currentPro=0;
            byte[] buffer=new byte[per];

            int len;
            while ((len=is.read(buffer))!=-1)
            {
                os.write(buffer,0,len);
                completed+=per;
                long pro=Math.round ((double)completed/length*100);
                if(currentPro!=pro){
                    System.out.println("已经完成："+pro+"%");
                    currentPro=pro;
                }

            }
//            int read=is.read(buffer);
//            os.write(buffer);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                try {
                    is.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
