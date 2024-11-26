package SimbirSoft.homework_03.ModelCar;


public abstract class Car {
    String TypeCar;
    protected String Brand;
    protected String Model;
    int ProductionYear;
    protected static int countOfCar = 0;
    public Car(String TypeCar, String Brand, String Model, int ProductionYear){
        this.TypeCar = TypeCar;
        this.Brand = Brand;
        this.Model = Model;
        this.ProductionYear = ProductionYear;
        countOfCar++;

    }

    public abstract void displayinfo();

}

