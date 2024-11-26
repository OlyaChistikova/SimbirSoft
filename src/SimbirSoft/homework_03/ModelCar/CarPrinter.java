package SimbirSoft.homework_03.ModelCar;

import SimbirSoft.homework_03.ModelCar.Interfaces.Printable;

public class CarPrinter implements Printable<Car> {
    @Override
    public void print(Car car) {
        car.displayinfo();  // Вывод информации о транспортном средстве
    }
}
