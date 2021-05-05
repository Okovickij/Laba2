package counstructor;
import java.util.ArrayList;
import entitiy.Port;
import menu.MenuController;


public class MainInitializer {
    public static void init() {
        initContext();
        initMenu();
    }
private static void initContext()
{
    Context.port = new Port();
    Context.waitingShips=new ArrayList<>();
    generatePort();

}
private static void initMenu(){
        MenuController.getInstance().run();
}

private static void generatePort(){Port port =new Port();
    port.capacity=0;
    port.setNumberOfShips(0);
    port.ships =new ArrayList<>();
}
}
