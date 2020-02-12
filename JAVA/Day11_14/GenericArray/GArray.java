package GenericArray;

public class GArray <T>{
	private T[] arr;
	
	public void setArr(T[] str) {
		arr = str; 
	}
	public void printArr() {
		for(T s : arr)
			System.out.print(s +"\t");
	}
}
