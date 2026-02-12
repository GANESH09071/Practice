//  Develop a Java program to find the number of even numbers in an array
public class EvenNumber 
{
    static int evenNum(int[] arr,int index)
    {
        if(index==arr.length)
            return 0;
    
        if(arr[index]%2==0)
        {
            return 1+evenNum(arr,index+1);
        }else
        {
            return evenNum(arr,index+1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2,4,6,8,1};
        System.out.println(evenNum(arr, 0));


    }
    
}
