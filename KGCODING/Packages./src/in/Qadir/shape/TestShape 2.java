package in.Qadir.shape;

public class TestShape
{
    public static void main(String[] args)
    {
        // Shape shape = new Shape();  Error
        Circle circle = new Circle(5);
        Square sq = new Square(5);

        System.out.printf("Area of circle is : %.2f and area of Square is : %.2f",circle.calcluateArea(), sq.calcluateArea() );
    }
}