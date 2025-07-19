class Solution {
    public void sortColors(int[] arr) {
        int start=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high--]=temp;
            }
            else if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[start];
                arr[start]=temp;
                start++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
        
    }
}