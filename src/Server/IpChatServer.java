package Server;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IpChatServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			serversocket = new ServerSocket(7777); //서버소켓 포트번호 생성
			System.out.println("서버 실행");
		    socket = serversocket.accept();
		    
		    Sender sender = new Sender(socket);
		    sender.start();
		    
		    Receiver receiver = new Receiver(socket);
		    receiver.start();
		    
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}
