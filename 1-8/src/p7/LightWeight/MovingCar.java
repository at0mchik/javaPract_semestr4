package p7.LightWeight;

public class MovingCar {
    private Car car;
    private int[] cords;
    private int speed;
    private String  serialNumber;

    public MovingCar(Car car, int[] cords, int speed, String serialNumber){
        this.car = car;
        this.cords = cords;
        this.speed = speed;
        this.serialNumber = serialNumber;
    }

    public void move(){
        car.move(cords, speed, serialNumber);
    }
}
