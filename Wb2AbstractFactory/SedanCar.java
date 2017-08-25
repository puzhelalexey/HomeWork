package Wb2AbstractFactory;

/* class SedanCar
 */

public class SedanCar extends AbstractCar {

    public SedanCar(CarType carType) {
        super(carType);
    }

    @Override
    public String getModel() {
        return getCarType().toString();
    }

    @Override
    public String getColor() {
        return "black";
    }

    @Override
    public String getOwnerOfTheCar() {
        return "major Vasgen";
    }
}
