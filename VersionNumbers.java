public class VersionNumbers 
{
     public int compareVersion(String version1, String version2) 
    {
        int start1 =0,start2=0;
        int n1=version1.length(),n2= version2.length();

        while(start1<n1 || start2<n2)
        {
            int num1=0;
            while(start1<n1 && version1.charAt(start1)!='.')
            {
                num1=num1*10 +version1.charAt(start1)-'0';
                start1++;
            }

             int num2=0;
            while(start2<n2 && version2.charAt(start2)!='.')
            {
                num2=num2*10 +version2.charAt(start2)-'0';
                start2++;
            }

            if(num1<num2)
                return -1;
            else if(num1>num2)
                return 1;

            start1++;
            start2++;


        }
        return 0;
    }

    public static void main(String[] args) {
        VersionNumbers obj = new VersionNumbers();
        String v1 ="1.11";
        String v2 ="1.10";
        System.out.println(obj.compareVersion(v1, v2));
    }
    
}
