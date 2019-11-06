// importing the java util.Arrays package because we use the methods
//which are defined inside og the util.Arrays package;
import java.util.Arrays;


//creating a class
class EqualArrays{

	// defining the main method
	public static void main(String[] args) {

		//initializing two arrays with different names
		// first array
		int[] arr = {1, 2, 3, 4, 6, 5};
		//seconde array
		int arr2[] = {1, 2, 3, 4, 5,6};

		System.out.println("Are the two arrays are Equal??");
		/* calling the equals method from util.Arrays which seems to be static
		 it returns true if all the elements and the index of each element is same in
		 both of the arrys;
		 And returns false if members of an array or their elements did not match 
		 to each other

		 */
		System.out.println(Arrays.equals(arr, arr2));

		/* in the above it returns false because their elements are same but 
			their index numbers are not same...
		*/
	}

	
}