package Day11_11;

class Board {

}
class PBoard extends Board {

}
class ClassCast{
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println("..intermediate location..");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1;
		//컴파일 에러가 왜 안 날까?
		//new는 동적생성이니까 런타임에 생성되잖아 그니까 실행할 때 예외 발생 ^^*
		
	}
}