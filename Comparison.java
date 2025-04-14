import java.util.*;

public class Comparison {
    public static void main(String[] args) {
        // Data awal
        int[] array = {10, 20, 30, 40, 50};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Traversal
        System.out.println("Array Traversal: " + Arrays.toString(array));
        System.out.println("ArrayList Traversal: " + arrayList);

        // Pencarian 30
        int indexArray = linearSearch(array, 30);
        int indexArrayList = arrayList.indexOf(30);
        System.out.println("\nPencarian 30 dalam Array: Ditemukan di indeks " + indexArray);
        System.out.println("Pencarian 30 dalam ArrayList: Ditemukan di indeks " + indexArrayList);

        // Penyisipan 25 ke index 2
        array = insertIntoArray(array, 2, 25);
        arrayList.add(2, 25);
        System.out.println("\nArray setelah penyisipan elemen 25: " + Arrays.toString(array));
        System.out.println("ArrayList setelah penyisipan elemen 25: " + arrayList);

        // Perbandingan waktu pencarian
        long start = System.nanoTime();
        linearSearch(array, 30);
        long arrayTime = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.indexOf(30);
        long arrayListTime = System.nanoTime() - start;

        System.out.printf("\nWaktu eksekusi pencarian pada Array: %.4f ms\n", arrayTime / 1_000_000.0);
        System.out.printf("Waktu eksekusi pencarian pada ArrayList: %.4f ms\n", arrayListTime / 1_000_000.0);
    }

    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int[] insertIntoArray(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = value;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }
}
