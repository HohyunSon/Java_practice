package IOStream;

import java.io.*;

class Point implements Serializable
{
    int x;
    int y;
    public Point (int x ,int y){
        this.x = x;
        this.y = y;
    }
}
class Circle implements Serializable
{
    Point p;
    double rad;

    public Circle(int x, int y, double r)
    {
        p = new Point(x,y);
        rad=r;
    }
    public void showCircleInfo()
    {
        System.out.printf("[%d, %d] \n", p.x, p.y);
        System.out.println("rad: "+rad);
    }
}
class SerializationTest implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("Test.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        out.writeObject(new Circle(1,1,2.4));
        out.writeObject(new Circle(2,2,4.8));
        out.close();

        FileInputStream fis = new FileInputStream("Test.ser");
        ObjectInputStream in = new ObjectInputStream(fis);

        Circle cl1=(Circle)in.readObject();
        Circle cl2=(Circle)in.readObject();
        in.close();

        cl1.showCircleInfo();
        cl2.showCircleInfo();
    }
}