package menu.actions;
import menu.Action;
import java.util.Scanner;
import Services.PortService;

public class DeleteShip implements Action {
    @Override
    public void execute() {
        System.out.println("-------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Id корабля: ");
        int l = Integer.parseInt(scan.next());
        PortService.deleteShip(l);
    }
}
