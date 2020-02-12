package Day11_08;

public class MinMax implements IMinMax {
	@Override
	public double max(double[] arr) {
		double max = arr[0];
		
		for(double n : arr)
			if(n > max)
				max = n;
			
		return max;
	}
	@Override
	public double min(double[] arr) {
		double min = arr[0];
		
		for(double n : arr)
			if(n < min)
				min = n;
		
		return min;
	}
}
