package lab4;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        Car.CarBuilder cb1 = new Car.CarBuilder();
        Car.CarBuilder cb2 = new Car.CarBuilder();
        Train.TrainBuilder tb = new Train.TrainBuilder();
        cb1.setMark("BMW");
        cb1.setModel("x6");
        cb1.setEngineSize(2.4);
        cb1.setWheels(4);

        tb.setMark("Accela");
        tb.setModel("Express");
        tb.setEngineSize(5);
        tb.setCountWagons(10);

        cb2.setMark("Audi");
        cb2.setModel("a6");
        cb2.setEngineSize(1.8);
        cb2.setWheels(4);

        Train train = (Train) tb.build();
        Car car1 = (Car) cb1.build();
        Car car2 = (Car) cb2.build();
    }
}
