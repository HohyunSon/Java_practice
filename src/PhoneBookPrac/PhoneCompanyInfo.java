package PhoneBookPrac;

class PhoneCompanyInfo extends PhoneInfo {
    private String company;

    public PhoneCompanyInfo(String name,String phoneNum,String company) {
        super(name,phoneNum);
        this.company = company;
    }
    public void show()
    {
        System.out.println("이름 : "+ getName());
        System.out.println("전화번호 : "+getName());
        System.out.println("회사 : "+company);
        System.out.println();
    }
}