package Day11_04;

class InstCnt {
	private static int instNum = 0;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성: "+ instNum);
	}
}
