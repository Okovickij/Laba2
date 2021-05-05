package menu.actions;
import menu.Action;
import Services.WaitingShipsService;
public class ListOfWaitingShips implements Action{
    @Override
    public void execute()
    {
        System.out.println("Список кораблей, ожидающих прибытия в порт: ");
        System.out.println(" № " + "  Название " + "   Кол-во больших контейнеров " + " Кол-во маленьких контейнеров " + "  Массса груза ");
        System.out.println("-------------------------------------------------");
        WaitingShipsService.ListOfWaitingShips();
        System.out.println("-------------------------------------------------");
    }
}
