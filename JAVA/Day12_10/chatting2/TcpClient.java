package chatting2;

import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		try {
			String serverIp = "192.168.6.15";
			Socket socket = new Socket(serverIp, 7777);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Reciever reciever = new Reciever(socket);
			
			sender.start();
			reciever.start();
		}catch(Exception e) {
			
		}
	}
}
