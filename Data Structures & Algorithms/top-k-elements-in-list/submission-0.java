class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for (int i = 0; i <= nums.length; i++) {

            buckets[i] = new ArrayList<>();
        }

        for (int key : map.keySet()) {
            
            int frequency = map.get(key);
            buckets[frequency].add(key);
        }

        for (int i = buckets.length-1; i >= 0 && index < k; i--) {

            for (int num : buckets[i]) {

                answer[index++] = num;
            }

            if (index == k) break;
        }

        return answer;
    }
}
