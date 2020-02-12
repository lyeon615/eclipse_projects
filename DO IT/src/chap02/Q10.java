package chap02;

import chap02.PhysicalExamination.PhysicalData;

//시력 분포를 그래프로 출력하도록 바꾸어 프로그램을 나타내세요
//기호문자 *을 이용해서 아래와 같이 나오게 하시오
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
			new Physical("박현규", 162, 0.3),
			new Physical("함진아", 173, 0.7),
			new Physical("최윤미", 175, 2.0),
			new Physical("홍연의", 171, 1.5),
			new Physical("이수진", 168, 0.4),
			new Physical("김연준", 174, 1.2),
			new Physical("박용규", 169, 0.8),
			new Physical("김보련", 167, 0.3),
		};
		String[] vmax = new String[VMAX];
		for(int i = 0 ; i < VMAX ; i++)
			vmax[i] = "";
		
		System.out.println("ㅇ 신체검사 리스트 ㅇ");
		System.out.println("이름           키   시력");
		System.out.println("---------------");

		for(int i = 0 ; i < d.length ; i++)
			System.out.printf("%-8s%3d%5.1f\n", d[i].name, d[i].height, d[i].vision);
		
		System.out.printf("평균키 : %4.1f\n", aveHeight(d));
		
		vmaxR(d, vmax);
		
		System.out.println("시력 분포");
		for(int i = 0 ; i < vmax.length; i++)
			System.out.printf("%3.1f~ : %-2s\n", i / 10.0, vmax[i]);

	}	
}
