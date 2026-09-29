package recursion;

import java.util.ArrayList;

;

public class StringBasicMore {
    public static void main(String[] args) {
        String s = "Kartikey";
        change(s);
        System.out.println(s);

        String[] arr = {"Santosh", "krish", "hemant", "Preet"};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        ArrayList<String> al = new ArrayList<>();
        al.add("Shravani");
        al.add("Umang");
        al.add("shellay");
        al.add("Riya");
        System.out.println(al);
        change2(al);
        System.out.println(al);
    }
    private static void change2(ArrayList<String> al){
        al.add("Biplab");
    }

    public static void change(String s){
        s = "lavish";
    }
}