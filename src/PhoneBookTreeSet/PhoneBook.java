package PhoneBookTreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class PhoneBook{
    private static PhoneBook pb;
    private TreeSet<PhoneBookInfo> pInfoArr;
    PhoneBook(int size) {
        pInfoArr = new TreeSet<>(new Comparator<PhoneBookInfo>() {
            @Override
            public int compare(PhoneBookInfo p1, PhoneBookInfo p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
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
