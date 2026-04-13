import java.util.List;

public class ApplesandOranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        
        int applescount=0;
        int orangescount =0;
        int countA =0;
        int countO =0;
        for(int i = 0;i<apples.size();i++)
        {
             applescount = a+apples.get(i);
            
            if(applescount>=s && applescount<=t) 
            {
                countA++;
            }
        }
        
          for(int i = 0;i<oranges.size();i++)
        {
             orangescount = b+oranges.get(i);
            
            if(orangescount>=s && orangescount<=t) 
            {
                countO++;
            }
        }
        System.out.println(countA);
        System.out.println(countO);
        
        
    }

}
    

