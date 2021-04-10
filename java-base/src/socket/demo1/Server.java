package socket.demo1;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author  xy
 * @date    2021-04-10 18:30:28
 * @desc    服务端
 */
public class Server {
    private ServerSocket serverSocket = null;
    private Socket socket = null;
    private DataInputStream input = null;
    public Server(int port){
        try{
            System.out.println("bind port ...");
            serverSocket = new ServerSocket(port);
            System.out.println("Server started and waiting a client ..");
            socket = serverSocket.accept();
            input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while(!line.equals("exit")){
                try {
                    line = input.readUTF();
                    System.out.println("recd: " + line);
                } catch (IOException o) {
                    o.printStackTrace();
                }
            }
            // 关闭连接
            System.out.println("connection closed ...");
            input.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
