public class Money {
    public int totalMoney(int n) 
    {
        int total=0;
        int dailyMoney =1;
        int weekStart=1;

       for(int day=1;day<=n;day++)
       {
            total +=dailyMoney;

            dailyMoney++;

            if(day%7==0)
            {
                weekStart++;
                dailyMoney = weekStart;
            }

       }
       return total;
    }
    public static void main(String[] args)
    {
        Money obj = new Money();
        int n =10;
        System.err.println(obj.totalMoney(n));
    }
}
    

