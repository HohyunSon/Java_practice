package PhoneBookPrac;

class PhoneInfo{
    private String name;
    private String phoneNum;

    PhoneInfo(String name,String phoneNum)
    {
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public void show()
    {
        System.out.println("이름 : "+ name);
        System.out.println("전화번호 : "+phoneNum);
        System.out.println();
    }
    public String getName(){
        return name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
}