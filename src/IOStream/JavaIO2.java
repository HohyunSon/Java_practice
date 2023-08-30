package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class JavaIO2 {
    public static void main(String[] args) throws IOException
    {
        OutputStream out = new FileOutputStream("hyper.txt");
        out.write('A');
        out.write('B');
        out.close();
    }
}