package entitiy;

public class Cargo
{
    public static int weight;
    private int numberOfBigCargo;
    private int numberOfSmallCargo;

    public int getNumberOfBigCargo() {
        return numberOfBigCargo;
    }

    public void setNumberOfBigCargo(int numberOfBigCargo) {
        this.numberOfBigCargo = numberOfBigCargo;
    }

    public int getNumberOfSmallCargo() {
        return numberOfSmallCargo;
    }

    public void setNumberOfSmallCargo(int numberOfSmallCargo) {
        this.numberOfSmallCargo = numberOfSmallCargo;
    }
}
