package Sort;

import java.util.*;
//버블정렬 알고리즘을 최적화 하였다.
class BubbleSort2
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
            int cnt = 0 ;// 한번 돌때마다 cnt 를 0으로 초기화
            for(int j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    tmp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = tmp;
                    cnt++;
                }
            }
            if (cnt==0) //치환이 더 이상 일어나지 않는다면 break;
            {
                break;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}