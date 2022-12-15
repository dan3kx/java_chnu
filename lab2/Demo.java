package lab2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        Car.CarBuilder cb1 = new Car.CarBuilder();
        Car.CarBuilder cb2 = new Car.CarBuilder();
        Train.TrainBuilder tb = new Train.TrainBuilder();
        cb1.setMark("Audi");
        cb1.setModel("a8");
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

        List<Vehicle> myList1 = new ArrayList<>();
        myList1.add(train);
        myList1.add(car1);
        myList1.add(car2);
        List<Car> myList2 = new ArrayList<>();
        myList2.add(car1);
        myList2.add(car2);

        SerializeToJSON serializerJSON = new SerializeToJSON();
        SerializeToXml serializerToXml = new SerializeToXml();
        SerializeToTxt serializerToTxt = new SerializeToTxt();


        System.out.println("JSON:");
        serializerJSON.writeToFile(myList1,"myJSON.json");
        System.out.println(serializerJSON.readFromFile("myJSON.json"));

        System.out.println("XML:");
        serializerToXml.writeToFile(myList1,"myXML.xml");
        System.out.println(serializerToXml.readFromFile("myXML.xml"));

        System.out.println("TXT:");
        serializerToTxt.writeToFile(myList2,"myTXT.txt");
        System.out.println(serializerToTxt.readFromFile("myTXT.txt"));
    }
}
