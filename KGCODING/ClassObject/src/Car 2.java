public class Car
{
    static int noOfCarSolds;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitre;
    int noOfSaets;
    static
    {
        noOfCarSolds = 0;
        System.out.println("I am in static bolck.");
    }
    {
        noOfCarSolds++;
        System.out.println("I am in init block.");
    }

    Car(String color)
    {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLitre = 2;
        noOfSaets = 5;
    }
    Car()
    {
        this("Black");
        currentFuelInLitre = 5;
    }
    public Car start()
    {
        if(currentFuelInLitre == 0)
        {
            System.out.println("Car is out in fuel, can't start.");
        }
        else if(currentFuelInLitre < 5)
        {
            System.out.println("Car is in reserved mode, please refuel.");
        }
        else
        {
            System.out.println("Car is started... bruhhh.......");
        }
        return this;
    }

    public void drive()
    {
        if(currentFuelInLitre == 0)
        {
            System.out.println("Car is out in fuel.");
        }
        else
        {
            System.out.println("Car is driving");
            currentFuelInLitre--;
        }
    }

    public void addFuel(float fuel)
    {
        currentFuelInLitre += fuel;

    }

    public float getCurrentFuelInLitre() {
        return currentFuelInLitre;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am in finalize");
    }
}
