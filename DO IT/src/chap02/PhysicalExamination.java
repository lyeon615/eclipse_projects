package chap02;

import java.util.Scanner;

public class PhysicalExamination {
	static final int VMAX = 21;

	static class PhysicalData {
		String name;
		int height;
		double vision;

		PhysicalData(String n, int h, double v) {
			this.name = n;
			this.height = h;
			this.vision = v;
		}
	}

	static double aveHeight(PhysicalData[] data) {
		double sum = 0;

		for (int i = 0; i < data.length; i++)
			sum += data[i].height;

		return sum / data.length;
	}

	static void distVision(PhysicalData[] data, int[] vmax) {
		int i = 0;

		for (i = 0; i < data.length; i++)
			if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
				vmax[(int) (data[i].vision* 10)]++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PhysicalData[] x = { new PhysicalData("������", 162, 0.3), new PhysicalData("������", 173, 0.7),
				new PhysicalData("������", 175, 2.0), new PhysicalData("ȫ����", 171, 1.5), new PhysicalData("�̼���", 168, 0.4),
				new PhysicalData("�迬��", 174, 1.2), new PhysicalData("�ڿ��", 169, 0.8), };
		int[] vmax = new int[VMAX];

		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�           Ű   �÷�");
		System.out.println("---------------");

		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("���Ű : %4.1f\n", aveHeight(x));

		distVision(x, vmax);

		System.out.println("�÷� ����");
		for (int i = 0; i < vmax.length; i++)
			System.out.printf("%3.1f~ : %d��\n", i / 10.0, vmax[i]);

		sc.close();
	}
}
