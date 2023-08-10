package PhoneBookPrac6;

public class PhoneBook {
    private static PhoneBook pb;
    private PhoneBookInfo[] arr;
    private int cnt;
    private PhoneBook(int size){
        arr = new PhoneBookInfo[size];
        cnt = 0;
    }
    public static PhoneBook getPhoneBook(int size){
        if(pb == null)
            pb = new PhoneBook(size);
        return pb;
    }
    public void inputPhoneInfo(PhoneBookInfo phoneBookInfo){
        int i=0 , j=0;
        for(i=0;i<cnt;i++)
        {
            if(arr[i].getName().charAt(0)>phoneBookInfo.getName().charAt(0))
            {
                for(j=cnt-1;j>=i;j--)
                {
                    arr[j+1] = arr[j];
                }
                break;
            }
        }
        arr[i] = phoneBookInfo;
        cnt++;
    }
    public boolean search(String name){
        for(int i=0;i<cnt;i++)
        {
            if(name.compareTo(arr[i].getName())==0) {
                arr[i].show();
                return true;
            }
        }
        return false;
    }
    public boolean deletePhone(String phone){
        for(int i=0;i<cnt;i++)
        {
            if(phone.compareTo(arr[i].getPhone())==0)
                for(int j=i;j<cnt;j++) {
                    arr[j] = arr[j + 1];
                    cnt --;
                    return true;
                }
        }
        return false;
    }
    public void showAll(){
        for(int i=0;i<cnt;i++)
            arr[i].show();
    }
}
