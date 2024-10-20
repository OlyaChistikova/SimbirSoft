package SimbirSoft.ModelCar;
import java.util.Objects;

interface Drivable{
    default void stop(){
        System.out.println("Car stopping...");
    };
    void start();
}

interface Serviceable{
    void service();
}
abstract class Car {
    String TypeCar;
    private String Brand;
    private String Model;
    int ProductionYear;
    protected static int countOfCar = 0;

    public Car(String TypeCar, String Brand, String Model, int ProductionYear){
        this.TypeCar = TypeCar;
        this.Brand = Brand;
        this.Model = Model;
        this.ProductionYear = ProductionYear;
        countOfCar++;

    }


    public void sayBrandAndModelAndClass(){
        String classCar = "";
        if (ProductionYear < 1900){
            classCar = "rarityCar";
        } else if (ProductionYear < 2010){
            classCar = "oldCar";
        } else if (ProductionYear < 2020){
            classCar = "modernCar";
        } else if (ProductionYear <= 2024){
            classCar = "newCar";
        }
        System.out.println("Car brand: " + Brand + ", car model: " + Model );
        System.out.println("Classification of car: " + classCar );
    }
    public String sayTypeOfCar(){
        return TypeCar;
    }
    public static int getCarCount(){
        return countOfCar;
    }
}
