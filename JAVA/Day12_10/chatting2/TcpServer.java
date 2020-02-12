package chatting2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {

	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
	
		Socket socket = null;
		
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			socket = serverSocket.accept();
			
			Sender sender = new Sender(socket);
			Reciever reciever = new Reciever(socket);
			
			sender.start();
			reciever.start();		
			
		}catch(Exception e) {
		}
		
		
	}

}

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;

	Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";

		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (out != null) {
			try {
				out.writeUTF(name + sc.nextLine());
			} catch (IOException e) {
			}
		}
		sc.close();
	}
}

class Reciever extends Thread {
	Socket socket;
	DataInputStream in;

	Reciever(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
			}
		}
	}
}
