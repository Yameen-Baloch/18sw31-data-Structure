import java.util.Arrays;

class DuplicateArray{
	public static void main(String args[]){
		int arr[] = {20, 20, 30, 40, 50, 20, 20, 30, 40, 50}; // 4
		Arrays.sort(arr);
		int count = 0;
		System.out.println("Arrays Without duplicates");
		for(int i = 0; i < arr.length; i++){

			if(i == arr.length-1){
				System.out.println(arr[i]);
				count++;
			}

			else if(arr[i] != arr[i+1]){
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Length of new array");
		System.out.println(count);
	}
}