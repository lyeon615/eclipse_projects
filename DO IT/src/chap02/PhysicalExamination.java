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

		PhysicalData[] x = { new PhysicalData("박현규", 162, 0.3), new PhysicalData("함진아", 173, 0.7),
				new PhysicalData("최윤미", 175, 2.0), new PhysicalData("홍연의", 171, 1.5), new PhysicalData("이수진", 168, 0.4),
				new PhysicalData("김연준", 174, 1.2), new PhysicalData("박용규", 169, 0.8), };
		int[] vmax = new int[VMAX];

		System.out.println("ㅇ 신체검사 리스트 ㅇ");
		System.out.println("이름           키   시력");
		System.out.println("---------------");

		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("평균키 : %4.1f\n", aveHeight(x));

		distVision(x, vmax);

		System.out.println("시력 분포");
		for (int i = 0; i < vmax.length; i++)
			System.out.printf("%3.1f~ : %d명\n", i / 10.0, vmax[i]);

		sc.close();
	}
}
