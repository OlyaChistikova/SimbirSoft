package SimbirSoft.ModelCar.Interfaces;

public interface Drivable {
    default void stop(){
        System.out.println("Car stopping...");
    };
    void start();
}