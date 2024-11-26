package SimbirSoft.homework_03.ModelCar;

public class CarBox <T extends Car> {
    private T car;

    public CarBox(T car) {
        this.car = car;
    }

    public T getCar() {
        return car;
    }

    public void displayCarInfo(){
        car.displayinfo();
    }
}

