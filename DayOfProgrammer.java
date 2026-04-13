public class DayOfProgrammer {
     public static String dayOfProgrammer(int year) 
     { 
        if (year == 1918) 
        {
            return "26.09.1918";
        }
        boolean isLeap = false;

        if (year < 1918) 
        {

            if (year % 4 == 0) 
            {
                isLeap = true;
            }
        } else 
        {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
            {
                isLeap = true;
            }
        }
        if (isLeap) 
        {
            return "12.09." + year;
        } else 
        {
            return "13.09." + year;
        }
    }
}

    

