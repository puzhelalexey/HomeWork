package Wb2AbstractFactory;

/* abstract class AbstractCar
 */

public abstract class AbstractCar implements Car {

    private CarType carType;

    public AbstractCar(CarType carType) {
        this.carType = carType;
    }

    protected CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "Car{" + "carType = " + carType +
                ", color = " + getColor() +
                ", OwnerOfTheCar = " + getOwnerOfTheCar() + '}';
    }
}
