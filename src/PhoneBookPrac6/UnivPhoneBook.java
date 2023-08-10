package PhoneBookPrac6;

public class UnivPhoneBook extends PhoneBookInfo{
    private String major;
    public UnivPhoneBook(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }
    public void show(){
        System.out.println("-----------");
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("전공 : "+major);
        System.out.println("-----------");
    }
}
