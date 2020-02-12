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
		System.out.println("나는 쓸모 없는 로봇... 춤도 못 추고 노래도 못 부르고 그림도 그리지 못해");
	}
}
class DanceRobot extends Robot{
	public void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot{
	public void sing(){
		System.out.println("노래를 부릅니다.");
	}
}
class DrawRobot extends Robot{
	public void draw() {
		System.out.println("그림을 그립니다.");
	}
}