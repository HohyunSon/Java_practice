package Test;

public class PB {
    private static PB pb;
    private PBIF[] arr;
    private int cnt;
    private PB(int size){
        arr = new PBIF[size];
        cnt = 0;
    }
    public static PB getPB(int size){
        if(pb == null)
            pb = new PB(size);
        return pb;
    }
    public void inputInfo(PBIF info){
        int i=0;
        int j=0;
        for(i=0;i<cnt;i++)
        {
            if(info.getName().compareTo(arr[i].getName())<0)
            {
                for(j=cnt-1;j>=i;j--)
                {
                    arr[j+1]=arr[j];
                }
                break;
            }
        }
        arr[i] = info;
        cnt++;
    }
    public boolean searchInfo(String name){
        boolean result=false;
        for(int i=0;i<cnt;i++)
            if(name.equals(arr[i].getName()))
            {
                arr[i].showCurrentInfo();
                result = true;
            }
        return result;
    }
    public boolean deleteInfo(String phone){
        boolean result=false;
        for(int i=0;i<cnt;i++)
            if(phone.equals(arr[i].getPhone()))
            {
                arr[i]=arr[i+1];
                arr[cnt-1]=null;
                cnt--;
                result = true;
            }
        return result;
    }
    public void show(){
        for(int i=0; i<cnt; i++)
            arr[i].showCurrentInfo();
    }
}
