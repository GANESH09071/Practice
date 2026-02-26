  import java.util.*;
public class Triangle 
{   
    public  int minimumTotal(List<List<Integer>> triangle) 
    {
        int n = triangle.size();
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                
                int down = triangle.get(i + 1).get(j);
                int diagonal = triangle.get(i + 1).get(j + 1);
                
                int minPath = Math.min(down, diagonal);
                
                triangle.get(i).set(j, triangle.get(i).get(j) + minPath);
            }
        }
        
        return triangle.get(0).get(0);
    }
        public static void main(String[] args) 
        {
         Triangle obj = new Triangle();
        List<List<Integer>> triangle = new ArrayList<>();
        
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

       
        
        int result = obj.minimumTotal(triangle);
        System.out.println(result);
        }
}
