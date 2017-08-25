package Wb2AbstractFactory;

/* class HatchbackCar
 */

public class HatchbackCar extends AbstractCar {

    public HatchbackCar(CarType carType) {
        super(carType);
    }

    @Override
    public String getModel() {
        return getCarType().toString();
    }

    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public String getOwnerOfTheCar() {
        return "major Vasgen";
    }
}
