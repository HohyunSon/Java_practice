package PhoneBookTreeSet;

import java.util.Objects;

public class PhoneBookInfo {
    private String name;
    private String phone;

    public PhoneBookInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void showCurrentInfo(){
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+phone);
        System.out.println();
    }

    @Override
    public int hashCode(){
        return Objects.hash(phone);
    }

    @Override
    public boolean equals(Object o){
        PhoneBookInfo p = (PhoneBookInfo) o;
        if(p.phone.equals(phone))
            System.out.println("중복된 값 입니다.");
        return p.phone.equals(phone);
    }
}
