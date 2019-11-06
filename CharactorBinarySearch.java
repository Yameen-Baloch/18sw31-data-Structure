import java.util.Arrays;

class CharactorBinarySearch{
    public static void main(String[] args) {
     char arr[] = {'w', 'e', 's','r', 'g', 'm'};
        Arrays.sort(arr); // we are sorting an array
        char a = 'g';
        System.out.println(CharactorBinarySearch.BinarySearch(arr, a));

    }

    public static String BinarySearch(char c[], char x){
        int l = 0; //  lower index;
        int u = c.length-1; // upper index

        
        //using while loop finding a char in the given array
        while(l <= u){
            int mid = (l+u)/2; // deviding an array in to two equal groups
            if(c[mid] == x){
                // if found the target element then just print it
                return (x+ " Found at index "+mid);
            }

            if(c[mid] < x){// checking the condition 

                l = mid+1; // becuase we already check the mid item;
            }
            if(c[mid] > x){
                u = mid-1; // becuase we already chck the middle one
            }
        }
        // if not found then just print not found
     return "Not Found";   
    }
}