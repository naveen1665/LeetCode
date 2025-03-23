class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        List<Integer> freqList = new ArrayList<>(map.values());
        Collections.sort(freqList);

        for (int i = 0; i < freqList.size(); i++) {
            int freq = freqList.get(i);
            if (k >= freq) {
                k -= freq;
                freqList.set(i, 0); 
            } else {
                break;  
            }
        }
        int uniqueCount = 0;
        for (int freq : freqList) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
