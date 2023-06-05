package p3;

import java.util.List;
import java.util.Set;

public class testList {
    private static List<Integer> list = new newList<>();

    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                list.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                list.add(i);
            }
        });

        thread1.start();
        thread2.start();



        System.out.println("List:");
        list.forEach(System.out::println);
    }
}
