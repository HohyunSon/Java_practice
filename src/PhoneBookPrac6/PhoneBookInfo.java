package PhoneBookPrac6;

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
    public void show(){
        System.out.println("-----------");
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+phone);
        System.out.println("-----------");
    }
}
