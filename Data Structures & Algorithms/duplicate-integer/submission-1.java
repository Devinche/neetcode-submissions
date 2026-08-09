class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        // int num = nums[0];

        // for (int i = 1; i < nums.length; i++) {

        //     if (num == nums[i]) {

        //         return true;
        //     } 

        //     num = nums[i];
        // }

        // return false;

        int count = 0;
        boolean result = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    result = true;
                }
            }
        }

        return result;
    }
}