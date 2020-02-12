package Day11_04;

public class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());
	}
}
class ColdPatient{
	void takeSinus(SinusCap cap) {
		cap.take();
	}
}
class SinusCap{
	SinivelCap siCap = new SinivelCap();
	SneezeCap szCap = new SneezeCap();
	SnuggleCap sfCap = new SnuggleCap();
	
	void take() {
		siCap.take();
		szCap.take();
		sfCap.take();
	}
}
class SinivelCap{
	void take() {
		System.out.println("�๰�� ��!");	
	}
}
class SneezeCap{
	void take() {
		System.out.println("��ä�Ⱑ ��~");
	}
}
class SnuggleCap{
	void take() {
		System.out.println("�ڰ� ��!");
	}
}


