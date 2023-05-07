import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
