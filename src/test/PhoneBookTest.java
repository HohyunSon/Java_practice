package test;

class PhoneBookTest
{
    private static PhoneBookTest pb;
    private PhoneInfoTest[] arr;
    private int cnt;

    private PhoneBookTest(int size){
        arr = new PhoneInfoTest[size];
    }
    public static PhoneBookTest getPhoneInfo(int size){
        if(pb==null)
            pb = new PhoneBookTest(size);
        return pb;
    }
    public boolean checkCnt(){
        if(cnt >= arr.length)
            return false;
        return true;
    }
    public void insertPhoneInfo(String name,String phone,String birth){
        arr[cnt++] = new PhoneInfoTest(name,phone,birth);
    }
    public boolean searchPhoneInfoByName(String name){
        boolean result = false;
        for(int i=0;i<cnt;i++) {
            if (name.equals(arr[i].getName())) {
                arr[i].showCurrentPhoneInfo();
                result=true;
            }
        }
        return result;
    }
     public int searchPhoneInfoByPhone(String phone){
        int result=-1;
        for(int i=0;i<cnt;i++) {
            if (phone.equals(arr[i].getPhone())) {
                result=i;
            }
        }
        return result;
    }
    public boolean deletePhoneInfo(String phone)
    {
        boolean result = false;
        int num = searchPhoneInfoByPhone(phone);
        if(num!=-1)
        {
            for(int i=num;i<cnt-1;i++)
                arr[i]=arr[i+1];
            arr[cnt-1]=null;
            cnt--;
            result = true;
        }
        return result;
    }

    public void showAllPhoneInfo(){
        for(int i=0;i<cnt;i++)
            arr[i].showCurrentPhoneInfo();
    }


}