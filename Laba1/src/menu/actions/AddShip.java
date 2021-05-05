package menu.actions;
import entitiy.Ship;
import menu.Action;
import java.util.Scanner;
import counstructor.Context;
import Services.CargoService;
public class AddShip implements Action{
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        int f;
        System.out.println("-------------------------------------------------");
        System.out.println("Введите id корабля: ");
        int y = Integer.parseInt(scan.next());
        System.out.println("Введите название корабля");
        String s2 = scan.next();
        System.out.println("Введите количество больших контейнеров на корабле(от 0 до 2):");
        String s3 = scan.next();
        int z = Integer.parseInt(s3);
        if (z == 0) {
            System.out.println("Введите количество малых контейнеров(от 1 до 4):");
            String s4 = scan.next();
            f = Integer.parseInt(s4);
            if (f < 1 && 5f > 4) throw new NumberFormatException("Введено некоректное значение!");
        } else if (z == 1) {
            System.out.println("Введите количество малых контейнеров(от 1 до 2): ");
            String s4 = scan.next();
            f = Integer.parseInt(s4);
            if (f < 1 && f > 2) {
                throw new NumberFormatException("Введено некоректное значение!");
            }
        } else if (z == 2)
            f = 0;
        else {
            throw new NumberFormatException("Вы ввели некоректное значение!");
        }
        int sum = CargoService.WeightCargo(z, f);
        Context.waitingShips.add(new Ship(y, s2, z, f, sum));
        System.out.println("------------------------------------------------");
    }
}
