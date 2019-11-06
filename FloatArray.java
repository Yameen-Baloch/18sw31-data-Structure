class FloatArray{
	//Main method
	public static void main(String args[]){

		//creating object for the class FloatArray
		FloatArray obj = new FloatArray();
		//initializing an array
		float a[] = {1.2f, 3.4f, 5.6f, 4.6f};

		//calling of AverageNumber Method...
		System.out.print(obj.AverageNumber(a));
	}

		// creating a function 
		// for doing the average of all the elements in an array..
		public float AverageNumber(float arr[]){
		float sum  = 0f;
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			// finding the sum of all the elements of the array..
			sum += arr[i];
			// counts thw how many elements are in the array
			count++;
		}
		// returns the average
		return sum/count;
	}
}