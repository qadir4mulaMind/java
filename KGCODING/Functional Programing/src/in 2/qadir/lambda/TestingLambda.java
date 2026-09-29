package in.qadir.lambda;
public class TestingLambda
{
    public int sum(int a, int b)
    {
        return a + b;
    }

    private void printString(String toPrint)
    {
        System.out.println(toPrint);
    }
    private static void main(String[] args)
    {
        TestingLambda test = new TestingLambda();
        test.sum(6, 7);
        test.printString("This is the best course.");

        // toPrint -> System.out.println(toPrint);
    }   // (a, b) -> a + b;
        // (a, b) ->
    // {
    // int sum = a + b;
    // System.out.println(sum);
    // }
}