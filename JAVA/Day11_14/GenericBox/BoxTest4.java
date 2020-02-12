package GenericBox;

public class BoxTest4 {

	public static void main(String[] args) {
		BoxPremise<Integer> iBox = new BoxPremise<Integer>();
		iBox.set(24);
		
		BoxPremise<Double> dBox = new BoxPremise<Double>();
		dBox.set(5.97);
		
		System.out.println(iBox.toIntValue());
		System.out.println(dBox.toIntValue());
	}
}
