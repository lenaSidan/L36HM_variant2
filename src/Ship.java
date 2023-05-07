import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Ship extends Transport{
    private String captainName;

    public Ship(String title, int capacity, double speed, String captainName) {
        super(title, capacity, speed);
        this.captainName = captainName;
    }

    @Override
    public String toString() {
        return "Вас приветствует " + captainName+"." +
                super.toString();
    }
    public String getCaptainName() {
        return captainName;
    }
    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }
}
