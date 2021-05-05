package menu;

public class MenuItem {
    private String title;
    private Action action;
    private Menu nextMenu;
    private Menu previousMenu;


    public Action getAction() {
        return action;
    }

    public Menu getNextMenu() {
        return nextMenu;
    }

    public String getTitle() {
        return title;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setNextMenu(Menu nextMenu) {
        this.nextMenu = nextMenu;
    }

    public void setPreviousMenu(Menu previousMenu) {
        this.previousMenu = previousMenu;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Menu getPreviousMenu() {
        return previousMenu;
    }

    public MenuItem(String title, Action action, Menu nextMenu, Menu previousMenu) {
        this.title = title;
        this.action = action;
        this.nextMenu = nextMenu;
        this.previousMenu = previousMenu;
    }


    public void executeAction() {
        action.execute();
    }
}
