import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Ship allureOfTheSeas = new Ship("Allure of the Seas", 4, 22,"Капитан Грей");
        allureOfTheSeas.getCapacity();
        System.out.println("Введите имена пассажиров (через запятую): ");
        //Jack Peter,Bob Snow,Anna May,Bobby Klaus,Maria Dorris
        String[]names = reader.readLine().split(",");
            for (String name : names){
              Passenger passenger = new Passenger(name);
              allureOfTheSeas.pickPassenger(passenger);
        }
        System.out.println("Введите имя пассажира, что бы проверить его по списку: ");
            String name = reader.readLine();
            if(allureOfTheSeas.dropPassenger(name)){
            System.out.println("Пассажир " +name+ " Ваша высадка.");
            }else {
                System.out.println("Пассажир " +name+ " в списке не значится.");
            }
    }
}