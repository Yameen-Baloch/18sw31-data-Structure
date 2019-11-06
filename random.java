/*
We are importing two classes from util package of the java
Arrays: we import this class because we use the built in methods inside 
this class;

Random: Because we use the method of Random class called random
for generating the random values

*/

import java.util.Arrays;
import java.util.Random;


// creating the calss name as RandomArray
class RandomArray{

	// Main Method
	public static void main(String[] args) {

		// initializing an array of size 100, but without the exact values..
		int arr[] = new int[100];
		// for loop for generating the random values from 1 to up to 100
		for(int i = 0; i < 100; i++){
			/*
				we are the method of Math class called random 
				It generates the random numbers from 0 to 99
				we add 1 because we want the numbers from 1 up to 100;
				Now the following code will produce the random numbers from 1 to 100

			*/
		int random = (int)(Math.random()*100+1);

		/*
			Now we are going to fill specified indexes of the array with generating 
			random numbers;
			The generated numbers are random not unique;
			we don't know that what number will come after this number
		*/
			arr[i] = random;
			
	}
	System.out.print(Arrays.toString(arr));


	}
}