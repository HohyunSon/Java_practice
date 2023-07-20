/*
실습문제 클래스 만들기1

        ①. 삼각형 클래스 만들기.
        멤버 변수(인스턴스 변수)
        밑변
        높이
        넓이

        멤버 메소드(인스턴스 메소드)
        삼각형 초기화 하는 메소드
        삼각형의 면적 구하는 메소드
        삼각형의 현재 상태 출력하는 메소드(밑변, 높이, 넓이 출력)

        ② 삼각형 인스턴스 3개 만들기
        1. 밑변 10, 높이 5
        2. 밑변 4, 높이 2
        3. 밑변 20 높이 10
        ③ ②에서 만든 삼각형 인스턴스들의 상태값 출력하기(밑변, 높이, 면적)
*/
package ClassPractice;
class Triangle
{
    int area;
    int base;
    int height;
    public void initTriangle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }
    public void triangleArea()
    {
        area = base * height /2;
    }
    public void printTri()
    {
        System.out.println("밑변 : "+base);
        System.out.println("높이 : "+height);
        System.out.println("넓이 : "+area);
        System.out.println();
    }

}
class TriangleClass
{
    public static void main(String[] args) {
        Triangle n1 = new Triangle();
        n1.initTriangle(10 , 5);
        n1.triangleArea();
        n1.printTri();

        Triangle n2 = new Triangle();
        n2.initTriangle(4 , 2);
        n2.triangleArea();
        n2.printTri();

        Triangle n3 = new Triangle();
        n3.initTriangle(20 , 10);
        n3.triangleArea();
        n3.printTri();
    }
}