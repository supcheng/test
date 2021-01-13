import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class qqServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket();
        server.bind(new InetSocketAddress(8888));
        System.out.println("开始");

        Socket accept=server.accept();
        InputStream inputStream = accept.getInputStream();
        byte[] buffer=new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            System.out.println(new String(buffer,0,len));
        }
        inputStream.close();
    }
}
