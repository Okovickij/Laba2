package menu.actions;
import menu.Action;
import java.util.Scanner;
import Services.PortService;

public class LoadShip implements Action {
    @Override
    public void execute()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Введите ID корабля,  который хотите загрузить в порт:");
        int number = Integer.parseInt(scan.next());
        PortService.loadShip(number);
    }
}
