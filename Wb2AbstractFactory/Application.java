package Wb2AbstractFactory;

/* class Application
 */

public class Application {

    public static void main(String[] args) {
        Car car = CarFactory.createCar(CarType.SEDAN);
        System.out.println(car);

        car = CarFactory.createCar(CarType.HATCHBACK);
        System.out.println(car);

        car = CarFactory.createCar(CarType.UNIVERSAL);
        System.out.println(car);

        car = CarFactory.createCar(CarType.ELECTRO);
        System.out.println(car);
    }
}
