package StaticPrac;

class Number
{
    public int num1;
    public static int num2;
    Number(){
        num1++;
        num2++;
    }
    public void printCS1(){
        System.out.println(num1+" "+num2);
    }
    public static void printCS2(){
        //printCS1();   XX불가
        //System.out.println(num1);  XX불가
    }
}
class Main
{
    public static void main(String[] args) {
        Number n1 = new Number();//num1->1
        Number n2 = new Number();//num1->1
        Number n3 = new Number();//num1->1
        //num2->3
        System.out.println(n1.num1);//1
        System.out.println(n2.num1);//1
        System.out.println(n3.num1);//1

        System.out.println(n1.num2);//3
        System.out.println(n2.num2);//3
        System.out.println(n3.num2);//3
        System.out.println(Number.num2);//3
    }
}