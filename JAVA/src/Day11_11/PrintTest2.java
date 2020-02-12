package Day11_11;

public class PrintTest2{
	public static void main(String[] args) {
		Printable2 prn1 = new SimplePrinter();
		Printable2 prn2 = new MultiPrinter();
		if(prn1 instanceof Printable2)
			prn1.printLine("This is a simple printer.");
		System.out.println();
		
		if(prn2 instanceof Printable2)
			prn2.printLine("This is a multiful printer.");
		System.out.println();
	}
}
class SimplePrinter implements Printable2 {
	public void printLine(String str) {
		System.out.println(str);
	}
}
class MultiPrinter extends SimplePrinter{
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}

}
