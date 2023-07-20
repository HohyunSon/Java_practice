package Loop;

class Test6{
    public static void main(String[] args) {
        int i = 1, j =1, sum=0;
        for(i=1;i<=5;i++) {
            System.out.println();
            for (sum = 1; sum <= 5; sum++) {
                System.out.print(j+"\t");
                j++;
            }
        }
    }
}