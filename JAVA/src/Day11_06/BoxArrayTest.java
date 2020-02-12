package Day11_06;

public class BoxArrayTest {
	public static void main(String[] args) {
		BoxArray[] ar = new BoxArray[3];
		ar[0] = new BoxArray("First");
		ar[1] = new BoxArray("Second");
		ar[2] = new BoxArray("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[2] = new String("Compiler");
		sr[3] = new String("Park");
		sr[4] = new String("Tree");
		sr[5] = new String("Dinner");
		sr[6] = new String("Brunch Cafe");
		
		int cnum = 0;
		for(int i = 0 ; i < sr.length ; i++)
			cnum += sr[i].length();
		
		System.out.println("ÃÑ¹®ÀÚÀÇ ¼ö : "+ cnum);
		
	}
}
class BoxArray{
	private String conts;
	
	BoxArray(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}
