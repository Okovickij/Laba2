package entitiy;

import java.util.ArrayList;

public class Port {
    public ArrayList<Ship> ships =new ArrayList<>();
    private int numberOfShips;
    public int capacity;

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfShips() {
        return numberOfShips;
    }

    public void setNumberOfShips(int numberOfShips) {
        this.numberOfShips = numberOfShips;
    }
}
