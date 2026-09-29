public class DiceRoll {

    int roll()
    {
        double random = Math.random() * 6;
        int currentRoll = (int)Math.ceil(random);
        return currentRoll;

    }
    public static void main(String[] args) {
        DiceRoll d1 = new DiceRoll();
        for(int i = 0; i < 10; i++)
        {
            System.out.println(d1.roll());
        }
    }
}