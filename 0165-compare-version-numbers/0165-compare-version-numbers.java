class Solution {
    public int compareVersion(String version1, String version2) {
        String [] arr1=version1.split("\\.");
        String [] arr2=version2.split("\\.");
        int n=arr1.length;
        int m=arr2.length;
        int row=Math.max(n,m);
        for(int i=0;i<row;i++)
        {
            int num1=i<n ? Integer.parseInt(arr1[i]) : 0;
            int num2=i<m ? Integer.parseInt(arr2[i]) : 0;
            if(num2<num1)
                return 1;
            else if(num1<num2)
                return -1;
        }
        return 0;
        
    }
}