package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        listMaker maker = new listMaker();
        ArrayList<Human> list = maker.humanListMake(10);
        System.out.println(list);


        Stream<Human> stream = list.stream();

//        System.out.println(" = SORT = \n");
//        stream.sorted(HumanComparator.compare()).forEach(System.out::println);

//        System.out.println(" = FILTER = \n");
//        stream.filter(i -> i.getAge() < 40).forEach(System.out::println);

//        System.out.println(" = FILTER 2 = \n");
//        stream.filter(i -> (i.getFirstName() + i.getLastName()).contains("e")).forEach(System.out::println);

        System.out.println(" = CONCATENATION = \n");

        System.out.println(stream.map(i -> i.getFirstName().substring(0, 1)).collect(joining("")));

    }
}
