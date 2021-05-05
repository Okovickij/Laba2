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

    public String getName() {
        return name;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu(String name)
{
    this.name=name;
}
    public Menu(List<MenuItem> menuItems){
    this.menuItems=menuItems;
}
    public Menu(String name, List<MenuItem> menuItems){
    this.name=name;
    this.menuItems=menuItems;
}
}
