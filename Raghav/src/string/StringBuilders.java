package string;

public class StringBuilders
{
    public static void main(String[] args)
    {
//        ArrayList<Character> str = new ArrayList<>();
//        str.add('a');
//        str.set(0, 'r');
//        System.out.println(str);
        StringBuilder sb = new StringBuilder("Raghav");
        System.out.println(sb);
        sb.append( " Garg");
        System.out.println(sb);
        StringBuilder x = new StringBuilder(6);
        System.out.println(x.length() + " " + x.capacity());
        x.append("Raghav");
        System.out.println(x);
        System.out.println(x.length() + " " + x.capacity());
        StringBuilder y = new StringBuilder("Abdul");
        System.out.println(y.length() + " " + y.capacity());
        String t = sb.toString();
        System.out.println(t);
        y.append("ahgasuyawgduwfcioswdcuiewgfccedhuiufhiuerfgogdfkjhedwiuwgeifgewoifriygewofygewofgew");
        System.out.println(y.length() + " " + y.capacity());
        y.append("t");
        System.out.println(y.length() + " " + y.capacity());
        y.append("sadjgkusadh");
    }
}