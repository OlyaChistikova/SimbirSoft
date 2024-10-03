package SimbirSoft.ModelCar;


public class Main {
    public static void main(String[] args) {
        SportCar ferrari = new SportCar();
        ferrari.sayBrandAndModel();

        System.out.println("Type of car: " + ferrari.sayTypeOfCar());
        ferrari.start();
        ferrari.stop();
        ferrari.sayMaxSpeedAndAcceleration();
        ferrari.service();
        System.out.println();

        SportCar mcLaren = new SportCar("SportCar", "McLaren", "Speedtail", 2018, 403, 3);
        mcLaren.sayBrandAndModel();
        mcLaren.sayMaxSpeedAndAcceleration();
        System.out.println("Type of car: " + mcLaren.sayTypeOfCar());
        System.out.println();

        Truck mer_benz = new Truck();
        mer_benz.sayBrandAndModel();
        System.out.println("Type of car: " + mer_benz.sayTypeOfCar());
        System.out.println("Count of wheels: " + mer_benz.getCountOfWheels());
        mer_benz.gerInfoAboutTruck();
        System.out.println();

        Truck sitrak = new Truck("Truck", "Sitrak", "C7H", 2015, 16.5, 40000, 6);
        sitrak.sayBrandAndModel();
        System.out.println("Type of car: " + sitrak.sayTypeOfCar());
        sitrak.gerInfoAboutTruck();
        System.out.println();
        System.out.println(Car.getCarCount());
        Truck.displayCountOfTrucks();
    }
}
