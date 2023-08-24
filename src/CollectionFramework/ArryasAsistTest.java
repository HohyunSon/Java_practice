package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArryasAsistTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Box", "Toy", "Box", "Toy");
        list = new ArrayList<>(list);

        for (String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();

        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for (String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();
    }
}
