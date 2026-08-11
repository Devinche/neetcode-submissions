class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {

            String s = strs[i];

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            String key = new String(arr);

            if (!map.containsKey(key)) {

                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        List<List<String>> answer = new ArrayList<>();

        for (String key : map.keySet()) {

            answer.add(map.get(key));
        }

        return answer;
        
    }
}
