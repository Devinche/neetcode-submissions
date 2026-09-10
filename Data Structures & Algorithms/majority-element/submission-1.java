public class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0, maxCount = 0;

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxCount) {
                
                answer = num;
                maxCount = map.get(num);
            }
        }
        return answer;
    }
}