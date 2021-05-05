package counstructor;
import entitiy.Port;
import entitiy.Ship;
import java.util.List;

public class Context
{
    public static Port port ;
    public static List<Ship> waitingShips;

    public Port getPort()
    {
        return port;
    }
    public void setPort(Port port)
    {
        this.port=port;
    }
}
