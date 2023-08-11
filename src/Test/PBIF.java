package Test;

public class PBIF {
    private String name;
    private String phone;

    public PBIF(String name,String phone) {
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
    }
}
