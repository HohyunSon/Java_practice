package Array;

class ArrayTest2{
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };
        int[][] table = new int[score.length][score[0].length+3];
        String[] menu = {"번호","국어","영어","수학","총점","평균"};
        for(int i=0;i<menu.length;i++)
            System.out.print(menu[i]+"\t");
        System.out.println();
        System.out.println("=======================");


        for(int j=0;j<score.length;j++) {
            for (int i = 0; i < score[0].length; i++) {
                table[j][0]=j+1;//번호
                table[j][i + 1] = score[j][i];//점수
                table[j][table.length-1]+= table[j][i+1];//총점
                table[j][table.length] = (table[j][4])/(score[0].length);//평균
            }
        }
        for(int j=0;j<table.length;j++) {
            for (int i = 0; i < table[0].length; i++) {
                System.out.print(table[j][i] + "\t");
            }
            System.out.println();
        }
        System.out.println("=======================");
        System.out.print("총점:");
        for(int j=0;j<score[0].length;j++) {
            int sum=0;
            for (int i = 0; i < score.length; i++)
                sum += table[i][1];
            System.out.print(sum+"\t");
        }
    }
}