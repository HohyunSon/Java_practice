package PhoneBookPrac;

class PhoneUnivInfo extends PhoneInfo {
    private String major;
    private String year;
    PhoneUnivInfo(String name,String phoneNum,String major,String year){
        super(name,phoneNum);
        this.major = major;
        this.year = year;
    }
    public void show()
    {
        System.out.println("이름 : "+ getName());
        System.out.println("전화번호 : "+getName());
        System.out.println("전공 : "+major);
        System.out.println("학년 : "+year);
        System.out.println();
    }
}