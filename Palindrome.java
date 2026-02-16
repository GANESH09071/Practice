class Palindrome 
{
    public static String shortestPalindrome(String s) 
    {
        for (int i = s.length(); i >= 0; i--) {
            if (isPalindrome(s, 0, i - 1)) {
                String suffix = s.substring(i);
                return new StringBuilder(suffix).reverse().toString() + s;
            }
        }
        return "";
    }

    private static  boolean isPalindrome(String s, int left, int right) 
    {

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
    public static void main (String[] args)
    {
        String s="aacecaaa";
        System.out.println(shortestPalindrome(s));
    }
}