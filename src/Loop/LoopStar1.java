package Loop;

class LoopStar1{
    public static void main(String[] args) {
        int i = 0, j =0;

        for(j=1;j<=5;j++) {
            for (i = 1; i <= j; i++)
                System.out.print("*");
            System.out.println();
        }

    }
}