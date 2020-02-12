package Day11_08;

public class RobotTest {
	public static void action(Robot robot){
		if(robot instanceof DanceRobot)
			((DanceRobot)robot).dance();
		else if(robot instanceof SingRobot)
			((SingRobot)robot).sing();
		else if(robot instanceof DrawRobot)
			((DrawRobot)robot).draw();
		else
			robot.action();

	}
	
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot(), new Robot()};
				
		for(int i = 0 ; i< arr.length ; i++)
			action(arr[i]);
	}

}
class Robot{
	public void action(){
		System.out.println("���� ���� ���� �κ�... �㵵 �� �߰� �뷡�� �� �θ��� �׸��� �׸��� ����");
	}
}
class DanceRobot extends Robot{
	public void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot{
	public void sing(){
		System.out.println("�뷡�� �θ��ϴ�.");
	}
}
class DrawRobot extends Robot{
	public void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}