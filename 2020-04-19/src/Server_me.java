import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/*
//socket ---套接字，槽，插座
public class Server {
    public static void main(String[] args)throws IOException {
        // 1--先开一家店
        ServerSocket serverSocket=new ServerSocket(9898);
        // 2--进行循环接收
        while (true){
            Socket socket=serverSocket.accept();

            InputStream is=socket.getInputStream();
            Scanner scanner=new Scanner(is,"UTF-8");//charsetName编码集
            String request=scanner.nextLine();
            System.out.println("收到请求"+request);
            String  response=request;
            OutputStream os=socket.getOutputStream();
            PrintWriter writer=new PrintWriter(new OutputStream(os,"UTF-8"));
            writer.println("你好");
            writer.flush();
        }
    }
}
*/
