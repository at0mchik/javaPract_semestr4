package p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class listMaker {
    Random rand = new Random();

    public ArrayList<Human> humanListMake(int num){
        String[] firstNameList = {"Yolanda", "Lloyd", "Erika", "Betty ", "Donald ", "Nathan ", "Peter ", "Daniel ", "Allan "};
        String[] lastNameList = {"Spencer", "Taylor", "Brown", "Patrick ", "King ", "Davis ", "Edwards ", "Boyd ", "Brown "};

        ArrayList<Human> returnList = new ArrayList<>();

        for(int i = 0; i < num; i++){
            int tempAge = rand.nextInt(18, 70);
            Human temp = new Human(
                    tempAge,
                    firstNameList[rand.nextInt(0, firstNameList.length)],
                    lastNameList[rand.nextInt(0, lastNameList.length)],
                    LocalDate.of(2022 - tempAge, rand.nextInt(1, 12), rand.nextInt(1, 31)),
                    rand.nextInt(50, 100)
            );
            returnList.add(temp);
        }

        return returnList;
    }

    public void print(ArrayList<Human> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("- " + (i+1) + "\n" + arr.get(i));
        }
    }
}

class HumanComparator implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return Math.max(o1.getAge(), o2.getAge());
    }
}
