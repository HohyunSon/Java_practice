package Sort;
import java.util.*;

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 5;
        int tmp;
        int[] num = new int[SIZE];
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "번째 숫자입력");
            num[i] = sc.nextInt();
        }

        for (int i=0;i<num.length-1;i++)
        {
            for(int j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}