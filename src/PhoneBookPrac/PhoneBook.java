package PhoneBookPrac;

class PhoneBook{
    private static PhoneBook pb;
    private PhoneInfo[] arr;
    private int cnt;
    private PhoneBook(int size) {
        arr = new PhoneInfo[size];
        cnt = 0;
    }
    public static PhoneBook getPhoneBook(int size)
    {
        if(pb == null)
            pb = new PhoneBook(size);
        return pb;
    }

    public void inputPhoneInfo(PhoneInfo phoneInfo)
    {
        int i=0 , j=0;
        for(i=0;i<cnt;i++)
        {
            if(arr[i].getName().charAt(0)>phoneInfo.getName().charAt(0))
            {
                for(j=cnt-1;j>=i;j--)
                {
                    arr[j+1] = arr[j];
                }
                break;
            }
        }
        arr[i] = phoneInfo;
        cnt++;
    }
    public void searchInfo(String name){
        for(int i = 0; i<cnt; i++)
        {
            if (name.equals(arr[i].getName()))
                arr[i].show();
        }
    }
    public void deleteInfo(String name){
        int idx=0;
        for(int i=0;i<cnt;i++)
        {
            if(name.equals(arr[i].getName()))
            {
                idx = i;
                break;
            }
        }
        for(int i = idx; i<cnt-1;i++)
            arr[i] = arr[i+1];
        arr[cnt-1] = null;
        cnt--;
        System.out.println("삭제가 완료되었습니다.");
    }
    public void showAll(){
        for(int i=0;i<cnt;i++)
            arr[i].show();
    }
}