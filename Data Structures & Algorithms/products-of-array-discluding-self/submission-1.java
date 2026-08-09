class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];
        int total = 1;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (j != i) {

                    total *= nums[j];
                }
    
            }

            answer[i] = total;
            total = 1;
        }
        
        return answer;
    }
}  
