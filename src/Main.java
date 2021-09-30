import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String [] array = {"abc1", "dfa2", "egc3", "fbd4"};
        System.out.println("Original array\n: " + Arrays.toString(array));
        swapElement(array,0, 1);
        System.out.println("Changed array\n: " + Arrays.toString(array));

        //Задание 2
        System.out.println("Current type as: " + array.getClass() );
        List <String> arrayList = convertToList (array);
        System.out.println("After convert as: " + arrayList.getClass());
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }

    public static <T> void swapElement(T[] array, int e1, int e2) {
        T temp = array [e1];
        array[e1] = array[e2];
        array [e2] = temp;
    }
}
