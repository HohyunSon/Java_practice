package Array;
import java.util.*;

class TwoDimentionalArray
{
    //문제 1
    public static void addOneDArr(int[] arr, int add)
    {
        for(int i=0;i<arr.length; i++)
            arr[i] += add;
    }
    public static void addTwoDArr(int[][] arr, int add) {
        for (int i = 0; i < arr.length; i++)
            addOneDArr(arr[i], add);
    }
    //문제 2
    public static void swapArr(int[][] arr) {
        int [] tmp = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = tmp;
    }
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        addTwoDArr(arr,7);
        for (int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
        System.out.println();
        swapArr(arr2);
        for (int i=0;i<arr2.length;i++)
            System.out.println(Arrays.toString(arr2[i]));
    }
}