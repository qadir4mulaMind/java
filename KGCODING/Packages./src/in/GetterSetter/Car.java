package in.GetterSetter;

public class Car
{
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public String getColor()
    {
        return color;
    }

    public String getModel()
    {
        return model;
    }

    public void setColor()
    {
        if(color.equals("Yellow"))
        {
            System.out.println("Pagal hai kya?");
        }
        else this.color = color;
    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase)
    {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

}