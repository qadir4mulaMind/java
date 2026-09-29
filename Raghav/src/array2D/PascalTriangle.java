package array2D;

import java.util.ArrayList;
import java.util.List;
public class PascalTriangle
{
    public List<List<Integer>> generate(int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            ans.add(new ArrayList<>());
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i) ans.get(i).set(j, 1);

                else
                {
                    int val = ans.get(i).set(j, ans.get(i - 1).get(j)) + ans.get(i - 1).get(j);
                    ans.get(i).set(j, val);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {

    }
}