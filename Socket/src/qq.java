import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class qq {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("192.168.0.104",8888));
        OutputStream outputStream=socket.getOutputStream();
        String msg="hello server";
        outputStream.write(msg.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
