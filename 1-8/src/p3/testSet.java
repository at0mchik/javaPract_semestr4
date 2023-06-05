package p3;

import java.util.Set;

public class testSet {
    private static Set<Integer> mySet = new newSet<>();

    public static void main(String[] args){
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i < 11; i++) {
                mySet.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                mySet.add(i);
            }
        });

        thread1.start();
        thread2.start();


        System.out.println("Set:");
        mySet.forEach(System.out::println);
    }
}
