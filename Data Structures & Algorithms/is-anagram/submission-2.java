class Solution {
    public boolean isAnagram(String s, String t) {

        boolean result = false;

         HashMap<Character, Integer> sHM = new HashMap<>();
         HashMap<Character, Integer> tHM = new HashMap<>();


        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {



                sHM.put(s.charAt(i), sHM.getOrDefault(s.charAt(i), 0) + 1);
                tHM.put(t.charAt(i), tHM.getOrDefault(t.charAt(i), 0) + 1);
            }

            if (sHM.equals(tHM)) {

                result = true;
            }

        }

        return result;
         
    }
}
