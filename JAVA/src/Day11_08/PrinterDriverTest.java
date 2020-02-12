package Day11_08;

public class PrinterDriverTest {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		Printable prn = new SPrintDriver();
		prn.print(myDoc);
		System.out.println();

		prn = new LPrintDriver();
		prn.print(myDoc);
		System.out.println();
		
	}
}
class SPrintDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}
class LPrintDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}