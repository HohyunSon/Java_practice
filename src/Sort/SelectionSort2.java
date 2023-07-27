package Sort;
//선택정렬 알고리즘을 최적화 하였다.
import java.util.Scanner;
public class SelectionSort2 {

    public static void main(String[] args) {

        final int SIZE = 5;
        int[] num = new int[SIZE];
        Scanner sc = new Scanner(System.in);
        int temp = 0, tempi=0;

        for(int i=0;i<num.length;i++)
        {
            System.out.println(i+1+"번째 수를 입력하세요.");
            num[i] = sc.nextInt();
        }

        for(int i=0;i<num.length-1;i++)
        {
            tempi = i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]>num[j])
                    i = j;
            }
            temp = num[tempi];
            num[tempi] = num[i];
            num[i] = temp;
            i = tempi;
        }

        for(int i=0;i<num.length;i++)
            System.out.print(num[i] + "\t");
    }
}