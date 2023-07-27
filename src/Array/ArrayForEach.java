package Array;
import java.util.Scanner;

public class ArrayForEach {
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int e : arr) {
            if(min>e)
            {
                min=e;
            }
        }
        return min;
    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        for (int e : arr) {
            if(max<e)
            {
                max=e;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++)
        {
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println(minValue(arr));
        System.out.println(maxValue(arr));
    }
}
