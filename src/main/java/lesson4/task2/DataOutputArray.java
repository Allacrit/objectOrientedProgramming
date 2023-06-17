package lesson4.task2;

public class DataOutputArray {
    public static <T> void printArray(T[] array) {
        int count = 0;
        System.out.print("[");
        for (T element : array) {
            System.out.print(element);
            count++;
            if (count < array.length) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
