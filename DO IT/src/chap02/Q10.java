package chap02;

import chap02.PhysicalExamination.PhysicalData;

//�÷� ������ �׷����� ����ϵ��� �ٲپ� ���α׷��� ��Ÿ������
//��ȣ���� *�� �̿��ؼ� �Ʒ��� ���� ������ �Ͻÿ�
//0.1~ : *
//0.2~ : ***
public class Q10 {
	static final int VMAX = 21;

	static class Physical{
		String name;
		int height;
		double vision;
		Physical(String n, int h, double v){
			this.name = n;
			this.height = h;
			this.vision = v;
		}
	}
	static double aveHeight(Physical[] d) {
		double sum = 0;
		for(int i = 0 ; i < d.length; i++)
			sum += d[i].height;
		
		return sum / d.length;
	}
	static void vmaxR(Physical[] d, String[] vmax) {
		int i = 0;
		vmax[i] = " ";
		for(i=0; i<d.length; i++)
			if(d[i].vision >= 0.0 && d[i].vision <= VMAX/10.0)
				vmax[(int)(d[i].vision*10.0)] += "*";
	}
	public static void main(String[] args) {
		Physical[] d = {
			new Physical("������", 162, 0.3),
			new Physical("������", 173, 0.7),
			new Physical("������", 175, 2.0),
			new Physical("ȫ����", 171, 1.5),
			new Physical("�̼���", 168, 0.4),
			new Physical("�迬��", 174, 1.2),
			new Physical("�ڿ��", 169, 0.8),
			new Physical("�躸��", 167, 0.3),
		};
		String[] vmax = new String[VMAX];
		for(int i = 0 ; i < VMAX ; i++)
			vmax[i] = "";
		
		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�           Ű   �÷�");
		System.out.println("---------------");

		for(int i = 0 ; i < d.length ; i++)
			System.out.printf("%-8s%3d%5.1f\n", d[i].name, d[i].height, d[i].vision);
		
		System.out.printf("���Ű : %4.1f\n", aveHeight(d));
		
		vmaxR(d, vmax);
		
		System.out.println("�÷� ����");
		for(int i = 0 ; i < vmax.length; i++)
			System.out.printf("%3.1f~ : %-2s\n", i / 10.0, vmax[i]);

	}	
}
