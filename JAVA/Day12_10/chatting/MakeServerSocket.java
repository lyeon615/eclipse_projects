package chatting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerSocket {

	ServerSocket serverSocket = null;
	Socket socket = null;

	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;

	public MakeServerSocket() {
		try {
			serverSocket = new ServerSocket(7777); // ��Ʈ��ȣ ���ϴ� ���� �ƹ��ų� ����!

			while (true) {

				socket = serverSocket.accept(); // Ŭ���̾�Ʈ�� ������ ������ ���缭 ��ٸ�
				System.out.println("Client ��û��");

				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				writer.close();
				reader.close();
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MakeServerSocket();
	}
}
