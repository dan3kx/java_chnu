package lab1;

public class Demo {
    public static void main(String[] args) {
        Car.CarBuilder cb = new Car.CarBuilder();
        Train.TrainBuilder tb = new Train.TrainBuilder();
        cb.setMark("Audi");
        cb.setModel("a8");
        cb.setEngineSize(2.4);
        cb.setWheels(4);

        tb.setMark("Accela");
        tb.setModel("Express");
        tb.setEngineSize(5);
        tb.setCountWagons(10);

        Car car = (Car) cb.build();
        Train train = (Train) tb.build();
        System.out.println(car);
        System.out.println(train);
    }
}
