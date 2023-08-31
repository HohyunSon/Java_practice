package PhoneBookFileIO;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

class PhoneBook  {
    private static PhoneBook pb;
    private HashSet<PhoneBookInfo> set;
    private PhoneBook() {
        load();
    }
    public static PhoneBook getPhoneBook(){
        if(pb == null)
            pb = new PhoneBook();
        return pb;
    }
    public void insertInfo(PhoneBookInfo phoneBookInfo){
        set.add(phoneBookInfo);
    }
    public boolean searchInfo(String name){
        PhoneBookInfo tmp;
        Iterator<PhoneBookInfo> it = set.iterator();
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
        Iterator<PhoneBookInfo> it = set.iterator();
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
        Iterator<PhoneBookInfo> it = set.iterator();
        while(it.hasNext())
            it.next().showCurrentInfo();
    }

    public void save(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal.ser")))
        {
            out.writeObject(set);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void load(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personal.ser"))) {
            set = (HashSet<PhoneBookInfo>) in.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
