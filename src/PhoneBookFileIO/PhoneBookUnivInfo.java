package PhoneBookFileIO;

public class PhoneBookUnivInfo extends PhoneBookInfo  {
    private String major;
    public PhoneBookUnivInfo(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }
    public void showCurrentInfo(){
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("전공 : "+major);
        System.out.println();
    }
}
