package Wb2AbstractFactory;

/* class CarFactory
 */

public class CarFactory {

    public static Car createCar(CarType type) {
        switch (type) {
            case SEDAN:
                return new SedanCar(type);
            case UNIVERSAL:
                return new UniversalCar(type);
            case HATCHBACK:
                return new HatchbackCar(type);
            case ELECTRO:
                return new ElectroCar(type);
            default:
                throw new IllegalArgumentException("Type is not supported");
        }
    }
}
