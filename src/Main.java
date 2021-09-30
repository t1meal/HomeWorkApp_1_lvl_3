import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        String [] array = {"abc1", "dfa2", "egc3", "fbd4"};
        System.out.println("Original array\n: " + Arrays.toString(array));
        swapElement(array,0, 1);
        System.out.println("Changed array\n: " + Arrays.toString(array));



    }
    public static <T> void swapElement(T[] array, int e1, int e2) {
        T temp = array [e1];
        array[e1] = array[e2];
        array [e2] = temp;
    }
}
