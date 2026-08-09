class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];
            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {

                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);

        }

        List<List<String>> result = new ArrayList<>();

        for (String key : map.keySet()) {

            result.add(map.get(key));
        }

        return result;
    }
}
