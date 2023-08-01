package Algorithm;
import java.util.Arrays;
import java.util.Random;

class Lotto
{
    private int[][] lotto;
    private Random random;
    private final int MAX = 6;
    private int numOfLotto;

    Lotto(int numOfLotto)
    {
        this.numOfLotto = numOfLotto;
        lotto = new int[numOfLotto][MAX];
        random = new Random();
    }
    public void execute()
    {
        makeLottos();
        sortLottos();
        printLottos();
    }
    public void makeLottos()
    {
        for(int i=0;i<numOfLotto;i++)
        {
            makeLotto(lotto[i]);
        }
    }
    public void sortLottos()
    {
        for(int i=0;i<numOfLotto;i++)
        {
            sortLotto(lotto[i]);
        }
    }
    public void printLottos()
    {
        for(int i=0;i<numOfLotto;i++)
        {
            printLotto(lotto[i]);
        }
    }
    public boolean chkNum(int idx, int[] lotto)
    {
        for(int i=0;i<idx;i++)
        {
            if(lotto[idx]==lotto[i])
            {
                return false;
            }
        }
        return true;
    }

    public void makeLotto(int[] lotto)
    {
        for(int i=0;i<lotto.length;i++)
        {
            lotto[i] = random.nextInt(45)+1;
            if( !chkNum(i, lotto) )
            {
                i--;
            }
        }
    }

    public void sortLotto(int[] lotto)
    {
        Arrays.sort(lotto);

		int tmp=0;
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}

    }

    public void printLotto(int[] lotto)
    {
        System.out.println(Arrays.toString(lotto));
		/*
		for(int i=0;i<lotto.length;i++)
			System.out.print(lotto[i] + " ");
		System.out.println();
		*/
    }
}

class LottoMain4
{
    public static void main(String[] args)
    {
        Lotto lotto = new Lotto(5);
        lotto.execute();
    }
}