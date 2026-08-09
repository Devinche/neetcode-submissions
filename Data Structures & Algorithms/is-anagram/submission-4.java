class Solution {
    public boolean isAnagram(String s, String t) {

        boolean answer = false;

        if (s.length() == t.length()) {
            
            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);

            if (Arrays.equals(sArr, tArr)) {

                answer = true;
            }
        }

        return answer;

    }
}
