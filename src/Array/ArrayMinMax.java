package Array;

import java.util.*;
class ArrayMinMax{
    public static int minValue(int[] arr)
    {
        int min = arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i])
                min = arr[i];
        }
        return min;
    }		// 최소값 반환
    public static int maxValue(int[] arr)
    {
        int max = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (max<arr[i])
                max = arr[i];
        }
        return max;

    }		// 최대값 반환

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++)
        {
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("최소값");
        System.out.println(minValue(arr));
        System.out.println("최대값");
        System.out.println(maxValue(arr));

    }
}