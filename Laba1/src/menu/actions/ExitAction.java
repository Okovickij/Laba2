package menu.actions;
import menu.Action;

public class ExitAction implements Action
{
    @Override
    public void execute()
    {
        System.out.println("Досвидание!");
        System.exit(0);
    }
}
