import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrpAnagrams
 {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        if(strs==null || strs.length==0)
        {
            return new ArrayList<>();
        }
        
        Map<String,List<String>> map = new HashMap<>();

        for(String str:strs)
        {
            String freqString = getFrequency(str);

            if(map.containsKey(freqString))
                map.get(freqString).add(str);

            else
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(freqString,list);
            }
        }
        return new ArrayList(map.values());
    }

    private String getFrequency(String str)
    {
        int[] freq = new int[26];

        for(char c:str.toCharArray())
        {
            freq[c-'a']++;
        }

        StringBuilder freqString = new StringBuilder();
        char c ='a';
        for(int i:freq)
        {
            freqString.append(c);
            freqString.append(i);
            c++;
        }

        return freqString.toString();
    }

    public static void main(String[] args) {
        GrpAnagrams obj = new GrpAnagrams();
        String[] str = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(str));
    }
}


    

