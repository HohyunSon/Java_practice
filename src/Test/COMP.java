package Test;

public class COMP extends PBIF{
    private String job;
    public COMP(String name, String phone, String job) {
        super(name, phone);
        this.job = job;
    }
    @Override
    public void showCurrentInfo(){
        System.out.println("이름 : "+getName());
        System.out.println("번호 : "+getPhone());
        System.out.println("직업 : "+job);
    }
}
