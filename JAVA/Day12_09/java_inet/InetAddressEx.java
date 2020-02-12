package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressEx {
	Scanner scanner;

	public InetAddressEx() {
		System.out.println("Host이름을 입력하세요.");
		scanner = new Scanner(System.in);
		
		try {
			
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
		
			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());
			
			System.out.println();
			
			InetAddress inetAddress2 = InetAddress.getLocalHost();

			System.out.println("MY Computer NAME : " + inetAddress2.getHostName());
			System.out.println("MY Computer IP : " + inetAddress2.getHostAddress());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}	
}
