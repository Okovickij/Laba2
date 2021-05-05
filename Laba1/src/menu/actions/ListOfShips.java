package menu.actions;
import Services.PortService;
import menu.Action;
import counstructor.Context;

public class ListOfShips implements Action {
    @Override
    public void execute()
    {
        System.out.println("-------------------------------------------------");
        if(Context.port.getNumberOfShips()!=0) {
        System.out.println("Количество кораблей в порту: " + Context.port.getNumberOfShips());
            System.out.println("Список кораблей в порту: ");
            System.out.println("-------------------------------------------------");
            System.out.println(" ID " + "  Название " + "   Общий вес доставленного груза ");
            PortService.shipsList();
        }
        else System.out.println("Порт пуст!");
        System.out.println("-------------------------------------------------");
    }
}
