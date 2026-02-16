package Leetcode;

class Rearrange {
    public static String rearrangeWords(String s) {

       String[] word = s.toLowerCase().split(" ");
       int n = word.length;

       for(int i=0;i<n;i++)
       {
        for(int j =0;j<n-i-1;j++)
        {
            if(word[j].length()>word[j+1].length())
            {
                String temp = word[j];
                word[j]=word[j+1];
                word[j+1]=temp;
            }
        }
        
       }

       StringBuilder sb = new StringBuilder();

       for(String result:word)
       {
        sb.append(result).append(" ");
       }

       sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));

       return sb.toString();
    }
       public static void main(String[] args)
    {
        String s="Leetcode makes me happy";
        System.out.println(rearrangeWords(s));


    }

}
        
    
