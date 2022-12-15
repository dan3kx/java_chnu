package lab2;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Objects;


public class Car extends Vehicle
{
    private int wheels;
    private double engineSize;

    public Car(CarBuilder cb) {
        super(cb);
        this.wheels = cb.wheels;
        this.engineSize = cb.engineSize;
        this.type = "carClass";
    }

    public Car(String mark, String model, String type, int wheels, double engineSize) {
        super(mark, model, type);
        this.wheels = wheels;
        this.engineSize = engineSize;
    }
    public Car(){}
    public int getWheels() {
        return wheels;
    }

    public double getEngineSize() {
        return engineSize;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return wheels == car.wheels && Double.compare(car.engineSize, engineSize) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels, engineSize);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", engineSize=" + engineSize +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static class CarBuilder extends VehicleBuilder
    {
        public int wheels;
        public double engineSize;

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setEngineSize(double engineSize) {
            this.engineSize = engineSize;
            return this;
        }

        @Override
        public Vehicle build() {
            return new Car(this);
        }
    }
}
