class Solution {
    public int countSeniors(String[] details) {
        
        List<String> list = new ArrayList<>();

        for (String str : details) {

            if (Integer.parseInt(str.substring(11, 13)) > 60) {

                list.add(str);

            }
        }

        return list.size();
    }
}