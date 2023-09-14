package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamToArrayList{
    public static void main(String[] args) {
        String[] str = {"Hello", "Box", "Robot", "Toy"};
        Stream<String> st = Arrays.stream(str);
        List<String> list = st.filter(s->s.length()<5)
                .collect(
                        ()->new ArrayList<>(),(c, s) -> c.add(s),(lst1, lst2)->lst1.addAll(lst2)
                );
        System.out.println(list);
    }
}

class StreamToArrayListToParallel{
    public static void main(String[] args) {
        String[] str = {"Hello", "Box", "Robot", "Toy"};
        Stream<String> st = Arrays.stream(str);
        List<String> list = st.parallel()
                .filter(s->s.length()<5)
                .collect(
                        ()->new ArrayList<>(),(c,s) -> c.add(s),(lst1,lst2)->lst1.addAll(lst2)
                );
        System.out.println(list);
    }
}