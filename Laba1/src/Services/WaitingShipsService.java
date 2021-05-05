package Services;

import counstructor.Context;

public class WaitingShipsService {
    public static void ListOfWaitingShips() {
        for (int i = 0; i < Context.waitingShips.size(); i++) {
            System.out.println(" " + Context.waitingShips.get(i).getId() + "   " + Context.waitingShips.get(i).getNameOfShip() + "                " + Context.waitingShips.get(i).getCargo().getNumberOfBigCargo() + "                                 " + Context.waitingShips.get(i).getCargo().getNumberOfSmallCargo() + "                 " + CargoService.WeightCargo(Context.waitingShips.get(i).getCargo().getNumberOfBigCargo(), Context.waitingShips.get(i).getCargo().getNumberOfSmallCargo()));
        }
    }
}
