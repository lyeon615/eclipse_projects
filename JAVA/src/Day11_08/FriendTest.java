package Day11_08;

public class FriendTest {
	public static void main(String[] args) {
	Friend[] frns = new Friend[10];
	int cnt = 0;
	frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-5555");
	frns[cnt++] = new UnivFriend("LEE", "Electronics", "010-222-4444");
	frns[cnt++] = new CompFriend("LEE", "R&D 1", "02-123-999");
	frns[cnt++] = new CompFriend("LEE", "R&D 2", "02-321-7777");
	
	for(int i = 0; i < cnt ; i++) {
		frns[i].showInfo();
		System.out.println();
		}
	}
}
