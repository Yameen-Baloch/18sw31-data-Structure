class SecondLarge{
	public static void main(String args[]){
		int a[] = {1,2, 3, 4, 6, 8,11,50, 13, 12, 15, 7, 9, 14, 19, 20};
		 
		SecondLarge obj = new SecondLarge();
		System.out.println(obj.secondLargest(a));
	}


	public int secondLargest(int arr[]){

		int max = 0;
		int secondMax = 0;
		for(int i = 0; i < arr.length; i++){
			
			if(max < arr[i]){
				secondMax = max;
				max = arr[i];
				
			}
			 if(max > arr[i]){
			 			secondMax = arr[i];
			 		
			 	
			}
			
		}
		return secondMax;
		
	}
}

