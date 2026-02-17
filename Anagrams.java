import java.util.ArrayList;
import java.util.List;

class Anagrams 
{
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> result = new ArrayList<>();

        if(s.length()<p.length())
            return result;

        int[] pCount = new int[26];

        for(char c:p.toCharArray())
        {
            pCount[c-'a']++;
        }

        int left=0;
        int right=0;
        int count =p.length();

        while(right<s.length())
        {
            if(pCount[s.charAt(right++)-'a']-- >=1) count--;

            if(count==0)   result.add(left);

            if( right-left == p.length() && pCount[s.charAt(left++) -'a']++ >=0)
                count++;
        }
        return result;      
    }
    public static void main(String[] args)
    {
        Anagrams obj = new Anagrams();
        String s ="cbaebabacd";
        String p ="abc";
        System.out.println(obj.findAnagrams(s,p));
        
    }
}