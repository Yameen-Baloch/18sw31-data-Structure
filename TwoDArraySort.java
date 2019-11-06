// importin the util package for the use of some class

import java.util.*;

class Arrays2D
{
    public static void main(String[] args)
    {

        int small, row = 0, col = 0, z;

        //2D array of 2x3;
        int[][] array = new int[2][3];

        // Making object of Random class for generation random numbers;

        Random rand = new Random();
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++)
            {
                //Input in array
                array[i][j] = rand.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // sorting the two dimensionla array
        for(int k = 0; k < array.length; k++)
        {
        for(int p = 0; p < array[k].length; p++)
            {
                small = array[k][p];
                for(int i = k; i < array.length; i++)
                {
                    if(i == k)
                        z = p + 1;
                    else
                        z = 0;
                    for(;z < array[i].length; z++)
                    {
                        if(array[i][z] <= small)
                        {
                            small = array[i][z];
                            row = i;
                            col = z;
                        }
                    }
                }
            array[row][col] = array[k][p];
            array[k][p] = small;
            // printing elements of sorted array..
            System.out.print(array[k][p] + " ");
            }
            System.out.println();
        }
    }
}