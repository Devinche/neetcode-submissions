class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> answer = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            answer.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {

            int difference = target - nums[i];

            if (answer.containsKey(difference) && answer.get(difference) != i) {

                return new int[]{i, answer.get(difference)};
            }
        }
        
        return new int[0];
    }
}
