class Solution {
    public int[] twoSum(int[] nums, int target) {

        /* A brute force solution would be to check every pair of numbers in the array. 
        This would be an O(n^2) solution. */
        
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target && i != j) {

                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        return answer;
    }
}
