package menu;
import menu.actions.*;
import menu.actions.ListOfWaitingShips;
import menu.actions.DeleteShip;
import menu.actions.AmountOfCapacity;
import menu.actions.ListOfShips;
import menu.actions.LoadShip;

public class MenuBuilder {
    public Menu mainMenu;
    private static MenuBuilder instance;

    private MenuBuilder() {
        buildMenu();
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    public static MenuBuilder getInstance() {
        if (instance == null) {
            instance = new MenuBuilder();
        }
        return instance;
    }
    public void buildMenu() {
        mainMenu = new Menu("Main");
        mainMenuInit();

        Navigator.getInstance().setCurrentMenu(mainMenu);
    }
    public void mainMenuInit() {
        mainMenu.getMenuItems().add(new MenuItem("1. Посмотреть сколько воды в порту", new AmountOfCapacity(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("2. Посмотреть список кораблей в порту", new ListOfShips(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("3. Удалить корабль из порта", new DeleteShip(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("4. Создать корабль", new AddShip(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("5. Посмотреть список кораблей, ожидающих прибытия в порт", new ListOfWaitingShips(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("6. Загрузить корабль в порт", new LoadShip(), null, null));
        mainMenu.getMenuItems().add(new MenuItem("7. Выйти из программы", new ExitAction(), null, null));
    }


}
