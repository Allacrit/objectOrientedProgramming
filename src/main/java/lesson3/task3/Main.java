package lesson3.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(88);
        number.add(1);
        number.add(17);
        number.add(25);
        number.add(36);
        number.add(99);
        number.add(18);

        Comparator<Integer>comparator = Integer::compareTo;
        MyPackegeCorted.sort(number,comparator);
        System.out.println(number);

        Comparator<Integer>comparator1 = Collections.reverseOrder();
        MyPackegeCorted.sort(number,comparator1);
        System.out.println(number);
    }
}
