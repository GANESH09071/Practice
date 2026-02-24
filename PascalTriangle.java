import java.util.ArrayList;
import java.util.List;
public class PascalTriangle 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                ans.add(1);
                else
                {
                    int value = result.get(i-1).get(j-1) +result.get(i-1).get(j);
                    ans.add(value);
                }
            }
            result.add(ans);
        }
        return result;   
    }
    public static void main(String[] args) 
    {
        PascalTriangle obj = new PascalTriangle();
        int n=5;
        System.out.println(obj.generate(n));
        
    }
}
    

