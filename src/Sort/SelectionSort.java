package Sort;
import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args) {

        final int SIZE = 5;
        Scanner sc = new Scanner(System.in);

        int[] num = new int[SIZE];
        int tmp;
        for(int i = 0 ; i<num.length;i++)
        {
            System.out.println((i+1)+"번째 숫자입력");
            num[i] = sc.nextInt();
        }
        for(int j=0;j<num.length-1;j++)
            for(int k=j+1;k<num.length;k++)
            {
                if(num[j]>num[k])
                {
                    tmp = num[j];
                    num[j] = num[k];
                    num[k] = tmp;
                }

            }
        for(int i=0;i<num.length;i++)
            System.out.print(num[i]+" ");
    }
}
