import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

    public static List<Integer> serviceLane(int n,List<Integer> width, List<List<Integer>> cases) 
    {
        
        List<Integer> list = new ArrayList<>();
        
        for(List<Integer> k:cases)
        {
            int start=k.get(0);
            int end=k.get(1);
        
        
        int minwidth=Integer.MAX_VALUE;
        
        for(int i=start;i<=end;i++)
        {
            minwidth=Math.min(minwidth,width.get(i));
            
        }
        
            list.add(minwidth);
        }
        
        return list;  
        
    }

}

