package SimbirSoft.homework_03.ModelCar;

import SimbirSoft.homework_03.ModelCar.Interfaces.Drivable;
import SimbirSoft.homework_03.ModelCar.Interfaces.Serviceable;

public class SportCar extends Car implements Drivable, Serviceable {

    private int MaxSpeed;
    private float Acceleration;

    public SportCar(){
        super("SportCar", "Ferrarri", "California", 2020);
        MaxSpeed = 316;
        Acceleration = 3.6f;
    }
    public SportCar(String TypeCar, String brand, String model, int production_year, int max_speed, float acceleration){
        super(TypeCar, brand, model, production_year);
        MaxSpeed = max_speed;
        Acceleration = acceleration;
    }
    public void sayMaxSpeedAndAcceleration(){
        System.out.printf("Maximum speed: %d km/h, acceleration: %f sec \n", MaxSpeed, Acceleration);
    }
    @Override
    public void start(){
        System.out.println("Sportcar starting...");
    }
    @Override
    public void stop(){
        System.out.println("Sportcar stopping...");
    }

    @Override
    public void service() {
        System.out.println("Sportcar servicing...");
    }
}
