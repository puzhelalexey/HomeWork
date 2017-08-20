package Wb2AbstractFactory;

/* class ElectroCar
 */

public class ElectroCar extends AbstractCar {

    public ElectroCar(CarType carType) {
        super(carType);
    }

    @Override
    public String getModel() {
        return getCarType().toString();
    }

    @Override
    public String getColor() {
        return "red";
    }

    @Override
   public String getOwnerOfTheCar() {
        return "major Vasgen";
    }

}
