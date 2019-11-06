import java.util.Arrays;


 class ArrayMethod{
public static void printArray(double arg[]){
    for(int i=0;i<arg.length;i++){
        System.out.println(arg[i]);
    }
}

	public static void main(String args[]){
	double[] arr = {1.2,2.3,3.5,4.5,5.2,6.0};
    double[] unsort = {1.0,6.1,4.8,5.0,3.1,2.2};
    double[] arr2 = {1.2,2.0,3.4,4.4,5.3,6.6};
    double[] dest=new double[10];
	//sort array
	Arrays.sort(arr);
	printArray(arr);
	//print length
	System.out.print("Length of an array");
	System.out.println(arr.length);
	System.out.println("Binary Search of number 3.5");
	//apply binary search and print results
	System.out.println(Arrays.binarySearch(arr, 3.5));
	//create a copy of array truncated or padded with zero based on size 
	//of new array
    double[] arrCopy=Arrays.copyOf(arr,10);
    System.out.println("copy of array printed");
    printArray(arrCopy);
    /*copy of range method copies
      the elements from some index to some index
      it takes 3 arguments 
      1. arr
      2. from where you want to copy the elements
      3. to upto where it copies
    */
    System.out.println("Copy Into Range");
    double[] copyIntoRange=Arrays.copyOfRange(arr,0,10);
    //printing array
    printArray(copyIntoRange);
    //equals method
    System.out.println("Equals Method in arrays");
    System.out.println(Arrays.equals(arr,arr2));
    //fill method
    Arrays.fill(arr2,2);
    //printing filled array
    System.out.println("filled array with 2");
	printArray(arr2);
	//filling in specific range
	Arrays.fill(arr2,2,4,0);
	//print array
	System.out.println("filling in specific range");
	printArray(arr2);	
	//sorting in specific range
	Arrays.sort(unsort,2,5);
	//print sorted array from 2 to 4 index
	System.out.println("Print Sorted Array");
    //print sorted array
	printArray(unsort);
	//print array converted to string
	System.out.println(Arrays.toString(unsort));
	}
}