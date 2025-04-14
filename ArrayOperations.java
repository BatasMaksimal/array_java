import java.util.Arrays;

public class ArrayOperations {

    // Traversal
    public static void traverse(int[] array) {
        System.out.println("Array Traversal: " + Arrays.toString(array));
    }

    // Linear Search
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    // Binary Search (Array must be sorted)
    public static int binarySearch(int[] array, int key) {
        return Arrays.binarySearch(array, key);
    }

    // Insertion (insert at index)
    public static int[] insert(int[] array, int value, int index) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    // Deletion (delete first occurrence)
    public static int[] delete(int[] array, int value) {
        int index = linearSearch(array, value);
        if (index == -1) return array;
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}
