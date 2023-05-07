import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Transport {
    private String title;
    private int capacity;
    private List<Passenger> passengers;
    private double speed;

    public Transport(String title, int capacity, double speed) {
        this.title = title;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\nДобро пожаловать на борт корабля " + "'" + title + "'" +
                "\nВместимость корабля " + capacity + " человек" +
                ", Скорость корабля = " + speed +
                " узла";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void printPassengers() {
        System.out.println("Список пассажиров: ");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.getName());
        }
    }

    public void pickPassenger(Passenger passenger){
        if(capacity>passengers.size()){
            passengers.add(passenger);
            System.out.println(passenger.getName()+ ", добро пожаловать на борт.");
        }else {
            System.out.println("Извините, "+passenger.getName()+ ", мест нет.");
        }
    }
    public boolean dropPassenger(String passengerName){
        for (Passenger passenger: passengers){
            if (passenger.getName().equals(passengerName)){
                return true;
            }
        }
        return false;
    }
}
