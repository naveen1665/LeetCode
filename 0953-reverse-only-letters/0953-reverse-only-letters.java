class Solution {
    public String reverseOnlyLetters(String s) {
        char [] arr=s.toCharArray();
        int left=0;
        int right=arr.length -1;
        while(left<right)
        {
            if(!Character.isLetter(arr[left]))
            {
                left++;
                continue;
            }

            if(!Character.isLetter(arr[right]))
            {
                right--;
                continue;
            }
            
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            res=res+arr[i];
        }
        return res;
        
    }
}