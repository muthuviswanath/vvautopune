
public class Occurance {
	public static void main(String[] args) {
		int arr[] = {1,2,2,2,3};
		int element = 2;
		int index = -99;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				System.out.println("Element's 1st occurance is at index value: " + i);
				break;
			}
		}

		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				index = i;
			}
		}
		
		System.out.println("Element's last occurance is at index value: " + index);
	}
}
