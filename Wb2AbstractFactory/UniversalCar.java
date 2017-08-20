package Wb2AbstractFactory;

/* class UniversalCar
 */

public class UniversalCar extends AbstractCar {

    public UniversalCar(CarType carType) {
        super(carType);
    }

    @Override
    public String getModel() {
        return getCarType().toString();
    }

    @Override
    public String getColor() {
        return "gray";
    }

    @Override
    public String getOwnerOfTheCar() {
        return "major Vasgen";

    }
}
