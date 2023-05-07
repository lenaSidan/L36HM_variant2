import java.io.*;
import java.util.List;

public class Main {
    public static final String PASSENGER_LIST = "./res/passengerList";
    //Jack Peter,Bob Snow,Anna May,Bobby Klaus,Maria Dorris
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(PASSENGER_LIST,false));

            Ship allureOfTheSeas = new Ship("Allure of the Seas", 4, 22, "Капитан Грей");
            allureOfTheSeas.getCapacity();
            System.out.println("Введите имена пассажиров (через запятую): ");
            String[] names = reader.readLine().split(",");

            for (String name : names) {
                Passenger passenger = new Passenger(name);
                allureOfTheSeas.pickPassenger(passenger);
                writer.write(passenger.getName());
                writer.newLine();
            }
            System.out.println("Введите имя пассажира, что бы проверить его по списку: ");
            String name = reader.readLine();
            if (allureOfTheSeas.dropPassenger(name)) {
                System.out.println("Пассажир " + name + " Ваша высадка.");
            } else {
                System.out.println("Пассажир " + name + " в списке не значится.");
                writer.write(reader.readLine());
            }
        reader.close();
        writer.close();
    }
}