package menu;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Menu {
private List<MenuItem> menuItems= new ArrayList<>();
private String name;

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Menu(String name)
{
    this.name=name;
}
}
