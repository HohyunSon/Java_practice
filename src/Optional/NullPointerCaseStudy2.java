package Optional;

import java.util.Optional;

class Friend2 {
    String name;
    Company2 cmp;    // null 일 수 있음

    public Friend2(String n, Company2 c) {
        name = n;
        cmp = c;
    }
    public String getName() { return name; }
    public Company2 getCmp() { return cmp; }
}

class Company2 {
    String cName;
    ContInfo2 cInfo;    // null 일 수 있음

    public Company2(String cn, ContInfo2 ci) {
        cName = cn;
        cInfo = ci;
    }
    public String getCName() { return cName; }
    public ContInfo2 getCInfo() { return cInfo; }

}

class ContInfo2 {
    String phone;   // null 일 수 있음
    String adrs;    // null 일 수 있음

    public ContInfo2(String ph, String ad) {
        phone = ph;
        adrs = ad;
    }
    public String getPhone() { return phone; }
    public String getAdrs() { return adrs; }

}

class NullPointerCaseStudy2 {
    public static void showCompAddr(Optional<Friend2> f) {
        String addr = f.map(Friend2::getCmp)
                .map(Company2::getCInfo)
                .map(ContInfo2::getAdrs)
                .orElse("There's no address information.");

        System.out.println(addr);
    }

    public static void main(String[] args) {

        ContInfo2 ci = new ContInfo2("321-444-577", "Republic of Korea");
        Company2 cp = new Company2("YaHo Co., Ltd.", ci);
        Friend2 frn = new Friend2("LEE SU", cp);

        // 친구 정보에서 회사 주소를 출력
        showCompAddr(Optional.of(frn));
    }
}

//Republic of Korea