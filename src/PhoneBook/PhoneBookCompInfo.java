package PhoneBook;

public class PhoneBookCompInfo extends PhoneBookInfo{
    private String job;
    public PhoneBookCompInfo(String name, String phone, String job) {
        super(name, phone);
        this.job = job;
    }
    public void showCurrentInfo(){
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("직업 : "+job);
        System.out.println();
    }
}
