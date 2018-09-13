import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest{
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		System.out.println("Hello world");
	}
}