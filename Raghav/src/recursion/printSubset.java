package recursion;

import java.util.ArrayList;
import java.util.List;

public class printSubset {

    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subSet("", s, 0, list);
        System.out.println(list);
    }

    private static void subSet(String ans, String s, int idx, List<String> list){
        if(idx == s.length()){
            if(ans.length() != 0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subSet(ans + ch, s, idx + 1, list); // pick
        subSet(ans, s, idx + 1, list); // skip
    }
}