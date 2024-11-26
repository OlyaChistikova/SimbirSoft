package SimbirSoft.homework_03.ModelCar;

import SimbirSoft.homework_03.ModelCar.Interfaces.Drivable;
import SimbirSoft.homework_03.ModelCar.Interfaces.Serviceable;


public class SportCar extends Car implements Drivable, Serviceable {

    private int MaxSpeed;
    private float Acceleration;

    public SportCar(String TypeCar, String Brand, String Model, int production_year, int max_speed, float acceleration){
        super(TypeCar, Brand, Model, production_year);
        MaxSpeed = max_speed;
        Acceleration = acceleration;
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
    @Override
    public void displayinfo(){

        System.out.println("car: " + TypeCar + ", brand: " + Brand + ", model: " + Model + ", MaxSpeed: " + MaxSpeed);
    }

}
