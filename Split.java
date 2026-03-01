 class Split {
 public char[] digits;
  

    public boolean splitString(String s) {
        this.digits = s.toCharArray();
        
        return dfs(0, -1);
    }
  
  
    private boolean dfs(int startIndex, long previousNumber) {
      
        if (startIndex >= digits.length) {
            return true;
        }
      
        long currentNumber = 0;

        int maxEndIndex = previousNumber < 0 ? digits.length - 1 : digits.length;
      
        
        for (int endIndex = startIndex; endIndex < maxEndIndex; endIndex++) {
            
            currentNumber = currentNumber * 10 + (digits[endIndex] - '0');
          
            
            boolean isValidSequence = (previousNumber < 0) || (previousNumber - currentNumber == 1);
          
            if (isValidSequence && dfs(endIndex + 1, currentNumber)) {
                return true;
            }
        }
      
        return false;
    }

    public static void main(String[] args) {
        Split obj = new Split();
        String s ="050043";
        System.out.println(obj.splitString(s));
    }
}