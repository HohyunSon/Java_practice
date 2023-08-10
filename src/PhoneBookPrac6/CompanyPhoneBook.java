package PhoneBookPrac6;

public class CompanyPhoneBook extends PhoneBookInfo{
    private String job;
    public CompanyPhoneBook(String name, String phone, String job) {
        super(name, phone);
        this.job = job;
    }
    public void show(){
        System.out.println("-----------");
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("직장 : "+job);
        System.out.println("-----------");
    }
}
