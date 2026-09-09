class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> mMap = new HashMap<>();

        for (Character ch : magazine.toCharArray()) {

            mMap.put(ch, mMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch : ransomNote.toCharArray()) {

            if (mMap.getOrDefault(ch, 0) <= 0) {

                return false;
            }

            mMap.put(ch, mMap.get(ch)-1);
        }

        return true;
    }
}