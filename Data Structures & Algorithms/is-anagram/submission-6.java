class Solution {
    public boolean isAnagram(String s, String t) {

        boolean answer = false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {

                sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
                tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
            }

              if (sMap.equals(tMap)) {

                answer = true;
              }
        }
            
        return answer;
    }
}
