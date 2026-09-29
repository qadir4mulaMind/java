package in.Qadir.shape;

public class Square extends Shape
{

    private final double sideInCms;

    public Square(double sideInCms)
    {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms()
    {
        return sideInCms;
    }

    @Override
    public double calcluateArea()
    {
        return Math.pow(sideInCms, 2);
    }

}