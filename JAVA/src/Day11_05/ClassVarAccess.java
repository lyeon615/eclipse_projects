package Day11_05;

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay a = new AccessWay();
		a.num++;  // �̷��� ���ٵ� ���������� ���뺯���̱� ������ �Ʒ��� ���� Ŭ���������� �����ϴ� �� ���� ����.
		AccessWay.num++;
		System.out.println("num = " + AccessWay.num);
	}
}
