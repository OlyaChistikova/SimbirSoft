package SimbirSoft.homework_03.ModelCar;

import SimbirSoft.homework_03.ModelCar.Interfaces.Drivable;
import SimbirSoft.homework_03.ModelCar.Interfaces.Serviceable;


public class Truck extends Car implements Drivable, Serviceable {
    private double loadingCapacity;
    private float weight;
    protected int countOfWheels;
    private static int countOfTrucks;


    public Truck(String TypeCar, String Brand, String Model, int production_year, double loadingCapacity, float weight, int countOfWheels){
        super(TypeCar, Brand, Model, production_year);
        this.loadingCapacity = loadingCapacity;
        this.weight = weight;
        this.countOfWheels = countOfWheels;
        countOfTrucks++;
    }

    @Override
    public void start(){
        System.out.println("Truck starting...");
    }
    @Override
    public void stop(){
        System.out.println("Truck stopping...");
    }

    @Override
    public void service() {
        System.out.println("Truck servicing...");
    }
    @Override
    public void displayinfo(){

        System.out.println("car: " + TypeCar + ", brand: " + Brand + ", model: " + Model + ", loadingCapacity: " + loadingCapacity + ", weight: " + weight);
    }
}
