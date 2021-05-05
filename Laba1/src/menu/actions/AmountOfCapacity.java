package menu.actions;
import menu.Action;
import Services.PortService;
public class AmountOfCapacity implements Action{
    @Override
    public void execute(){
        System.out.println("-------------------------------------------------");
        System.out.println("Количество воды в порту(литров): ");
        System.out.println(PortService.Capacity());
        System.out.println("-------------------------------------------------");
    }
}
