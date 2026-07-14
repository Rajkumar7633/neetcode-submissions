class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // step 2: convert map to list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // step 3: Sort according to frequency (Descending)
        list.sort((a, b)-> b.getValue() - a.getValue());

        // step 4 : Pick first k Element
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i).getKey();
        }

        return ans;

    }
}
