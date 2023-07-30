package test;

class PhoneInfoTest
{
    String name,phone,birth;
    PhoneInfoTest(String name,String phone,String birth){
        this.name=name;
        this.phone=phone;
        this.birth=birth;
    }
    PhoneInfoTest(String name,String phone){
        this.name=name;
        this.phone=phone;
    }
    public void showCurrentPhoneInfo(){
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+phone);
        System.out.println("생일 : "+birth);
        System.out.println();
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
}