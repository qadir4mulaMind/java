package in.qadir.enums;

public enum TrafficLight
{
    RED("STOP!"), GREEN("READY!"), YELLOW("GO!");

    private final String action;

    TrafficLight(String action)
    {
        this.action = action;
    }
}
