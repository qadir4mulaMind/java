public class ForEach {
    public static void main(String[] args) {
        String[] str = new String[]{"Ram", "shyam", "Mohan", "Seeta", "Geeta"};
        printArray(str);
    }
    public static void printArray(String[] array)
    {
        for(String i : array)
        {
            System.out.println(i);
        }
    }
}