package Services;
import counstructor.Context;
import entitiy.Ship;

public class PortService
{
    public static void deleteShip(int id)
    {
            for (int i = 0; i < Context.port.ships.size(); i++)
            {
                if (id == Context.port.ships.get(i).getId())
                {
                    Context.port.ships.remove(i);
                }
            }
            Context.port.setNumberOfShips(Context.port.getNumberOfShips()-1);

    }
    public static int Capacity()
    {
        return Context.port.getCapacity();
    }
    public static void loadShip(int number)
    {
        if(Context.waitingShips.size()!=0) {
            if (Context.port.getNumberOfShips()<= 10 && Context.port.getNumberOfShips()>=0) {
                for (int i = 0; i < Context.waitingShips.size(); i++) {
                    if (number == Context.waitingShips.get(i).getId()) {
                        Context.port.setNumberOfShips(Context.port.getNumberOfShips()+1);
                        Context.port.ships.add(new Ship(Context.waitingShips.get(i).getId(),Context.waitingShips.get(i).getNameOfShip(),Context.waitingShips.get(i).getCargo().getNumberOfBigCargo(),Context.waitingShips.get(i).getCargo().getNumberOfSmallCargo(),CargoService.WeightCargo(Context.waitingShips.get(i).getCargo().getNumberOfBigCargo(),Context.waitingShips.get(i).getCargo().getNumberOfSmallCargo())));
                        Context.port.capacity += CargoService.WeightCargo(Context.waitingShips.get(i).getCargo().getNumberOfBigCargo(), Context.waitingShips.get(i).getCargo().getNumberOfSmallCargo());
                        Context.waitingShips.remove(i);

                    } else System.out.println("Корабля с данным номеров нет!");
                }
            } else {
                System.out.println("Порт переполнен!");
            }
        }
        else System.out.println("Корабля с данным номеров нет!");
    }
    public static void shipsList()
    {
        for (int i = 0; i < Context.port.getNumberOfShips(); i++) {
            System.out.println(" "+Context.port.ships.get(i).getId() + "     " + Context.port.ships.get(i).getNameOfShip()+"             "+CargoService.WeightCargo(Context.port.ships.get(i).getCargo().getNumberOfBigCargo(),Context.port.ships.get(i).getCargo().getNumberOfSmallCargo()));
        }
    }
}
