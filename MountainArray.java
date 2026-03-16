class MountainArray
{
     public boolean validMountainArray(int[] arr) 
    {
        if(arr.length<3)
            return false;
        
        int mid=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]> arr[mid])
            mid=i;
        }
        
        if(mid==0||mid==arr.length-1)
        return false;

        for(int i=0;i<mid;i++)
        {
            if(arr[i]>=arr[i+1])
            return false;
        }

        for(int i=mid;i<arr.length-1;i++)
        {
            if(arr[i]<=arr[i+1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        MountainArray obj = new MountainArray();
        int[] arr = new int[]{0,3,2,1};
        System.out.println(obj.validMountainArray(arr));
        
    }
}