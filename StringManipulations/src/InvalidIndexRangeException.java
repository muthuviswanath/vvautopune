
public class InvalidIndexRangeException extends Exception{

	@Override
	public String getMessage() {
		return "InvalidIndexRangeException";
	}

	static int arraySum(int arr[], int x, int y) throws InvalidIndexRangeException{
		int sum =0;
		if(x<0 || y>arr.length) {
			throw new InvalidIndexRangeException();
		}
		else{
			for(int i=x; i<=y; i++) {
				sum += arr[i];
			}
		}
		return sum;
	}

}
