//String str1 = "ABCDEFGHIJKLMN"; 역순으로 출력
//String str2 = "990208-1012752" 이 문자열을 활용하여 중간에 삽입된 -를 삭제한 String 인스턴스를 생성.

package String;

class StringBuilder1
{
    public static void main(String[] args)
    {
        String str1 = "ABCDEFGHIJKLMN";
        String str2 = "990208-1012752";
        int idx=0;

        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        System.out.println(sb1.reverse().toString());

        idx = sb2.indexOf("-");
        if(idx != -1)
            System.out.println(sb2.deleteCharAt(idx).toString());
    }
}