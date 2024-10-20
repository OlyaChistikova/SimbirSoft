package SimbirSoft.ModelCar;

import java.util.Objects;

public class Truck extends Car implements Drivable, Serviceable{
    private double loadingCapacity;
    private float weight;
    protected int countOfWheels;
    private String classOfCapacity;
    private static int countOfTrucks;

    public Truck(){
        super("Truck", "Mercedes-Benz", "Atego", 2020);
        loadingCapacity = 8.850;
        weight = 5485.32f;
        countOfWheels = 4;
        countOfTrucks++;

    }
    public Truck(String TypeCar, String brand, String model, int production_year, double loadingCapacity, float weight, int countOfWheels){
        super(TypeCar, brand, model, production_year);
        loadingCapacity = loadingCapacity;
        weight = weight;
        countOfWheels = countOfWheels;
        countOfTrucks++;
    }
    public int getCountOfWheels(){
        return countOfWheels;
    }

    public void gerInfoAboutTruck(){
        if (loadingCapacity >= 0.5 && loadingCapacity <= 2){
            classOfCapacity = "small";
        } else if (loadingCapacity > 2 && loadingCapacity <= 5){
            classOfCapacity = "middle";
        } else if (loadingCapacity > 5 && loadingCapacity <= 16){
            classOfCapacity = "big";
        } else if (loadingCapacity > 16 && loadingCapacity <= 44){
            classOfCapacity = "really big";
        } else if (loadingCapacity < 0.5 || loadingCapacity > 44){
            classOfCapacity = "not correct";
        }
        if (!Objects.equals(classOfCapacity, "not correct")){
            System.out.println("Class of loading capacity truck is " + classOfCapacity);
        }

    }

    public static void displayCountOfTrucks(){
        System.out.println(countOfTrucks);
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
}
