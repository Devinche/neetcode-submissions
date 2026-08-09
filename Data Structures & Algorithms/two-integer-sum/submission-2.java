class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* HashMap solution with complexity of O(1). */
        
        int difference = 0;
        int[] answer = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            difference = target - nums[i];

            if (map.containsKey(difference)) {

                answer[0] = map.get(difference);
                answer[1] = i;
            }

            map.put(nums[i], i);
        }

        return answer;
        
    }
}
