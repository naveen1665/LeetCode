class Solution {
    public String swap(String s)
    {
        char [] arr=s.toCharArray();
        int left =0;
        int right=s.length()-1;
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public String reverseWords(String s) {
        String [] arr=s.split(" ");
        StringBuffer res=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            String temp=arr[i];
            temp=swap(temp);
            if(i==arr.length-1)
                res.append(temp);
            else
                res.append(temp+" ");
        }
        return res.toString();

        
    }
}