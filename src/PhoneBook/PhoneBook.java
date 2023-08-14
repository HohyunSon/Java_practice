package PhoneBook;

public class PhoneBook {
    private static PhoneBook pb;
    private PhoneBookInfo[] pInfoArr;
    int pInfoNum;
    PhoneBook(int size) {
        pInfoArr = new PhoneBookInfo[size];
        pInfoNum = 0;
    }
    public static PhoneBook getPhoneBook(int size){
        if(pb == null)
            pb = new PhoneBook(size);
        return pb;
    }
    public void insertInfo(PhoneBookInfo phoneBookInfo){
        if(pInfoNum>= pInfoArr.length) {
            System.out.println("저장공간 부족");
            return;
        }
        int i=0,j=0;
        for (i=0;i<pInfoNum;i++) {
            if (phoneBookInfo.getName().compareTo(pInfoArr[i].getName()) < 0) {
                for (j = pInfoNum - 1; j >= i; j--)
                    pInfoArr[j + 1] = pInfoArr[j];
                break;
            }
        }
        pInfoArr[i] = phoneBookInfo;
        pInfoNum++;
    }
    public boolean searchInfo(String name){
        boolean result =false;
        for(int i=0;i<pInfoNum;i++)
        {
            if(pInfoArr[i].getName().equals(name)) {
                pInfoArr[i].showCurrentInfo();
                result = true;
            }

        }
        return result;
    }
    public boolean deleteInfo(String phone){
        boolean result = false;
        for(int i=0;i<pInfoNum;i++)
        {
            if(pInfoArr[i].getPhone().equals(phone))
            {
                for(int j=i;j<pInfoNum;j++)
                    pInfoArr[j] = pInfoArr[j + 1];
                pInfoNum--;
                result = true;
            }
        }
        return result;
    }

    public void showAll(){
        for(int i=0;i<pInfoNum;i++)
            pInfoArr[i].showCurrentInfo();
    }
}
