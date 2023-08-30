package IOStream;

import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.io.RandomAccessFile;

class RandomAccessFileTest {

    public static void main(String[] args) {
        String fileName = "data.bin";
        RandomAccessFile rf = null;
        int rInt1 = 0, rInt2=0;
        double rDbl1 = 0, rDbl2 = 0;
        try
        {
            rf = new RandomAccessFile(fileName, "rw");
            System.out.println("Write..............");
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            rf.writeInt(200);
            rf.writeInt(500);
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            rf.writeDouble(48.65);
            rf.writeDouble(52.24);
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            System.out.println("Read..............");
            rf.seek(0);
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            rInt1 = rf.readInt();
            rInt2 = rf.readInt();
            System.out.println(rInt1 + " " + rInt2);
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            rDbl1 = rf.readDouble();
            rDbl2 = rf.readDouble();
            System.out.println(rDbl1 + " " + rDbl2);
            System.out.println("현재 포인터의 위치 " + rf.getFilePointer());
            rf.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("파일이 존재하지 않습니다.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
