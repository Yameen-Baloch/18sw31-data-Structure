import java.util.Arrays;

class StringBinarySearch{
    public static void main(String[] args) {
     String arr[] = {"my", "name", "is","yameen", "Ali", "baloch"};
        Arrays.sort(arr); // we are sorting an array

        // loop for treversing a sorted array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println(StringBinarySearch.BinarySearch(arr, "baloch"));

    }

    public static String BinarySearch(String str[], String x){
        int l = 0; //  lower index;
        int u = str.length-1; // upper index

        
        //using while loop finding a char in the given array
        while(l <= u){
            int mid = (l+u)/2; // deviding an array in to two equal groups
            int res = x.compareTo(str[mid]);
            if(res == 0){
                // if found the target element then just print it
                    return (x+ " Found at index "+mid);
                }

            if(res > 0){// checking the condition 

                l = mid+1; // becuase we already check the mid item;
            }
            if(res < 0){
                u = mid-1; // becuase we already chck the middle one
            }
        }
        // if not found then just print not found
     return "Not Found";   
    }
}