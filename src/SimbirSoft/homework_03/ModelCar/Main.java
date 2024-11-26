package SimbirSoft.homework_03.ModelCar;

import SimbirSoft.homework_03.ModelCar.Interfaces.Functional.Discriminant;
import SimbirSoft.homework_03.ModelCar.Interfaces.Functional.DivisibleBy13;

public class Main {
    public static void main(String[] args) {

        CarBox<SportCar> mcLaren = new CarBox<>(new SportCar("SportCar","McLaren", "Speedtail", 2018, 403, 3));
        mcLaren.displayCarInfo();
        System.out.println();

        CarBox<Truck> sitrak = new CarBox<>( new Truck("Truck", "Sitrak", "C7H", 2015, 16.5, 40000, 6));
        sitrak.displayCarInfo();
        System.out.println();

        DivisibleBy13 isDivisibleBy13 = number -> number % 13 == 0;
        System.out.println("Number = 26"+" is divisible by 13? " + isDivisibleBy13.check(26));
        System.out.println("Number = 33"+" is divisible by 13? " + isDivisibleBy13.check(33));

        Discriminant discriminantcalculator = (a, b, c) -> b*b - 4*a*c;
        double a = 1.0; double b =5.0; double c = 3.0;
        double discriminant = discriminantcalculator.calculate(a, b, c);
        System.out.println("Discriminant (" + a + "," + b + "," + c + ") = " + discriminant);
        System.out.println();

        SportCar mcLaren2 = new SportCar("SportCar", "McLaren", "Speedtail", 2018, 403, 3);
        Truck sitrak2 = new Truck("Truck", "Sitrak", "C7H", 2015, 16.5, 40000, 6);

        CarPrinter printer = new CarPrinter();

        // Печатаем информацию о каждом транспортном средстве
        System.out.println("Printing sportcar info:");
        printer.print(mcLaren2);
        mcLaren2.service();

        System.out.println("\nPrinting truck info:");
        printer.print(sitrak2);
        sitrak2.start();
        sitrak2.stop();
    }
}
