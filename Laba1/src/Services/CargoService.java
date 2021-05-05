package Services;

import entitiy.Cargo;

public class CargoService
{
    public static int WeightCargo(int numberOfBigCargo,int numberOfSmallCargo ) {
        int weightAllSmallCargo, weightAllBigCargo;
        weightAllBigCargo = 1000 * numberOfBigCargo;
        weightAllSmallCargo = 450 * numberOfSmallCargo;
        Cargo.weight = weightAllBigCargo + weightAllSmallCargo;
        return Cargo.weight;
    }
}
