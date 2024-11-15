package SimbirSoft.homework_03.ModelCar;

public class CarBox <T extends Car> {
    private T vehicle;

    public CarBox(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getCar() {
        return vehicle;
    }

    public void setCar(T vehicle) {
        this.vehicle = vehicle;
    }
}

