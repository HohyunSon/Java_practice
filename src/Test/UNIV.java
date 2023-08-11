package Test;

public class UNIV extends PBIF{
    private String major;
    public UNIV(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }
    @Override
    public void showCurrentInfo(){
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("전공 : "+major);
    }
}
