package lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) throws IOException {
        Car.CarBuilder cb1 = new Car.CarBuilder();
        Car.CarBuilder cb2 = new Car.CarBuilder();
        Train.TrainBuilder tb = new Train.TrainBuilder();
        cb1.setMark("BMW");
        cb1.setModel("x6");
        cb1.setEngineSize(2.4);
        cb1.setWheels(6);

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

        System.out.println("Comparable example");
        TreeSet<Car> list1 = new TreeSet<>();
        list1.add(car1);
        list1.add(car2);
        for (Vehicle v : list1)
        {
            System.out.println(v);
        }

        System.out.println("\nComparator example");
        List<Vehicle> list2 = new ArrayList<>();
        list2.add(car1);
        list2.add(train);
        list2.add(car2);
        list2.sort(new VehicleComparator());
        for (Vehicle v : list2)
        {
            System.out.println(v);
        }

        System.out.println("\nServices:");
        VehicleService vehicleService = new VehicleService(list2);
        System.out.println("\ngetListByType");
        for (Vehicle c : vehicleService.getListByType("carClass"))
        {
            System.out.println(c);
        }

        System.out.println("\ngetListByMark");
        for (Vehicle v : vehicleService.getListByMark("Audi"))
        {
            System.out.println(v);
        }

        System.out.println("\ngetListByModel");
        for (Vehicle v : vehicleService.getListByModel("x6"))
        {
            System.out.println(v);
        }

        System.out.println("\ngetListCarsByEngineSize");
        for (Vehicle v : vehicleService.getListCarsByEngineSize(1.8))
        {
            System.out.println(v);
        }

        System.out.println("\ngetListTrainsByEngineSize");
        for (Vehicle v : vehicleService.getListTrainsByEngineSize(5))
        {
            System.out.println(v);
        }
    }
}
