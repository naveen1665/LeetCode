class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int mark=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                mark=i;
                break;
            }
        }
        int left=0;
        int right=mark;

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
}