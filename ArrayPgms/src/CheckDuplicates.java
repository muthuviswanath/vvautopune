
public class CheckDuplicates {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		boolean duplicate = false;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
		}	
		System.out.println("Array has duplicate elements: " + duplicate);
	}
}
