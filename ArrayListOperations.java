import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    // Traversal
    public static void traverse(ArrayList<Integer> list) {
        System.out.println("ArrayList Traversal: " + list);
    }

    // Add element
    public static void add(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    // Remove element
    public static void remove(ArrayList<Integer> list, int value) {
        list.remove(Integer.valueOf(value));
    }

    // Search element
    public static int search(ArrayList<Integer> list, int value) {
        return list.indexOf(value);
    }

    // Sort elements
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
