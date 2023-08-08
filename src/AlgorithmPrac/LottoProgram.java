package AlgorithmPrac;

//1~45 6개 로또생성기
//1차원 배열 5세트
//빈배열에 1~45 순서대로 넣은후 섞기(shuffle)
//2차원 배열 5세트

class Lotto1{
    private static final int MAX =45;
    private static final int SET =6;
    public static void main(String[] args) {
        //문제 1
        int[] lotto = new int[MAX];
        int tmp;

        for(int i=0;i<lotto.length;i++)
            lotto[i] = i+1;

        //문제2
        for(int i=0;i<lotto.length;i++) //난수메소드를 이용하여 셔플
        {
            int blk;
            tmp = (int) ((Math.random() * MAX));
            blk = lotto[i];
            lotto[i] = lotto[tmp];
            lotto[tmp] = blk;
        }
        for(int j=0;j<SET-1;j++) //선택정렬을 이용하여 오름차순 정렬
            for(int k=j+1;k<SET;k++)
            {
                if(lotto[j]>lotto[k])
                {
                    int blk;
                    blk = lotto[j];
                    lotto[j] = lotto[k];
                    lotto[k] = blk;
                }

            }

        for(int i=0;i<6;i++)
            System.out.print(lotto[i]+" ");

    }
}


class Lotto2{
    private static final int MAX = 45;
    private static final int SET = 6;
    //문제 3
    public static void main(String[] args) {

        int[][] lotto = new int[SET][MAX];
        int tmp;

        for(int j=0;j<SET;j++) {
            for (int i = 0; i < lotto[j].length ; i++)
                lotto[j][i] = i + 1;
        }
        for(int j=0;j<SET;j++) {
            for (int i = 0; i < lotto[j].length; i++) {
                int blk;
                tmp = (int) ((Math.random() * MAX));
                blk = lotto[j][i];
                lotto[j][i] = lotto[j][tmp];
                lotto[j][tmp] = blk;
            }
        }
        for(int i=0;i<SET;i++) {
            for (int j = 0; j < SET - 1; j++) {
                for (int k = j + 1; k < SET; k++) {
                    if (lotto[i][j] > lotto[i][k]) {
                        int blk;
                        blk = lotto[i][j];
                        lotto[i][j] = lotto[i][k];
                        lotto[i][k] = blk;
                    }
                }
            }
        }
        System.out.println("로또 번호를 추첨합니다.");
        for(int j=0;j<SET-1;j++) {
            System.out.println(j+1+"회차");
            for (int i = 0; i < SET; i++)
                System.out.print(lotto[j][i]+ " ");
            System.out.println();
        }
    }
}
