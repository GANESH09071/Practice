public class MinNumber
{
    static int minNum(int[] arr,int index)
    {
        if(index==arr.length-1)
            return arr[index];

        //int minValue = minNum(arr,index+1);
        return Math.min (arr[index],minNum(arr,index+1));
   
    }
    public static void main(String[] args)
    {
        int [] arr = {12,2,-1,21,7};
        System.out.println(minNum(arr,0));


    }
    
}
