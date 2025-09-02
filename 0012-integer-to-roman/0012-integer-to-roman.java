class Solution {
    public String intToRoman(int num) {
        int res[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String arr[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer s=new StringBuffer();
        for(int i=0;i<res.length;i++)
        {
            if(num==0)
            {
                break;
            }
            while(res[i]<=num)
            {
                s.append(arr[i]);
                num-=res[i];
            }
        }
        return s.toString();




        
    }
}