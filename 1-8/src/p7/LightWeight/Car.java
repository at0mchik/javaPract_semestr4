package p7.LightWeight;

import java.util.Arrays;

public class Car {
    private int color;
    private String model;

    public Car(int color, String model){
        this.color = color;
        this.model = model;
    }

    public void move(int[] cords, int speed, String serialNumber){
        System.out.println("New cords: " + Arrays.toString(cords) + "\nSpeed: " + speed + "\nSerial number: " + serialNumber);
    }
}
