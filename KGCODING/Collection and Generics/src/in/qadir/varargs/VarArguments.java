package in.qadir.varargs;

public class VarArguments
{
    public static String concatenate(String... strs)
    {
        StringBuilder sb = new StringBuilder();
        for(String str : strs)
        {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(concatenate("Prashant"));
        System.out.println(concatenate("Jain"));
        System.out.println(concatenate("Today will complet my java."));
    }
}