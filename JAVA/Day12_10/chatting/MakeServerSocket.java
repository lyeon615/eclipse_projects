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
			serverSocket = new ServerSocket(7777); // 포트번호 원하는 숫자 아무거나 가능!

			while (true) {

				socket = serverSocket.accept(); // 클라이언트가 접속할 때까지 멈춰서 기다림
				System.out.println("Client 요청됨");

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
