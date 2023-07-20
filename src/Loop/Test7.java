package Loop;

class Test7{
    public static void main(String[] args) {
        int i = 1, j =28, sum=0;
        for(i=1;i<=3;i++) {
            System.out.println();
            for (sum = 1; sum <= 3; sum++) {
                System.out.print(j+"\t");
                j--;
            }
        }
    }
}