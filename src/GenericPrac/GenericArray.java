package GenericPrac;
import java.util.Arrays;

class GenericArray {
    public static <T> T getLastElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
    public static <T> void show(T[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Integer lastInt = getLastElement(intArray);
        show(intArray);

        String[] strArray = { "apple", "banana", "cherry" };
        String lastStr = getLastElement(strArray);
        show(strArray);

    }
}
