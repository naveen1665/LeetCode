class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length -1;i++)
        {
            List<Integer> temp=new ArrayList<>();
            int dif=arr[i+1]-arr[i];
            if(dif<min)
            {
                min=dif;
                list.clear();
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                list.add(temp);

            }
            else if(dif==min)
            {
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                list.add(temp);
            }

        }
        return list;

        
    }
}