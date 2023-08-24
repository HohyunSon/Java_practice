package PhoneBookHashSet;

import java.util.HashSet;
import java.util.Iterator;

public class PhoneBook {
    private static PhoneBook pb;
    private HashSet<PhoneBookInfo> pInfoArr;
    PhoneBook(int size) {
        pInfoArr = new HashSet<PhoneBookInfo>();
    }
    public static PhoneBook getPhoneBook(int size){
        if(pb == null)
            pb = new PhoneBook(size);
        return pb;
    }
    public void insertInfo(PhoneBookInfo phoneBookInfo){
        pInfoArr.add(phoneBookInfo);
    }
    public boolean searchInfo(String name){
        PhoneBookInfo tmp;
        Iterator<PhoneBookInfo> it = pInfoArr.iterator();
        boolean result =false;
        while(it.hasNext())
        {
            tmp = it.next();
            if(tmp.getName().equals(name))
            {
                tmp.showCurrentInfo();
                result = true;
            }
        }
        return result;
    }
    public boolean deleteInfo(String phone){
        PhoneBookInfo tmp;
        Iterator<PhoneBookInfo> it = pInfoArr.iterator();
        boolean result =false;
        while(it.hasNext())
        {
            tmp = it.next();
            if(tmp.getName().equals(phone))
            {
                it.remove();
                result = true;
            }
        }
        return result;
    }

    public void showAll(){
        Iterator<PhoneBookInfo> it = pInfoArr.iterator();
        while(it.hasNext())
            it.next().showCurrentInfo();
    }
}
