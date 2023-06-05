package p7.LightWeight;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<MovingCar> UniqueCars = new ArrayList<MovingCar>();
        ArrayList<Car> RepeatedCars = new ArrayList<>();

        RepeatedCars.add(new Car(1, "mercedes"));
        RepeatedCars.add(new Car(2, "bmw"));

        UniqueCars.add(new MovingCar(RepeatedCars.get(1), new int[]{10, 10}, 167, "AA111A777"));
        UniqueCars.add(new MovingCar(RepeatedCars.get(1), new int[]{50, 70}, 134, "AA111A777"));
        UniqueCars.add(new MovingCar(RepeatedCars.get(1), new int[]{142, 789}, 167, "AA111A777"));

        UniqueCars.forEach(MovingCar::move);
    }
}
