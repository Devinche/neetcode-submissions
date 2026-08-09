class Solution {

    public String encode(List<String> strs) {

        StringBuilder answer = new StringBuilder();

        for (String s : strs) {

            answer.append(s.length());
            answer.append("#");
            answer.append(s);
        }

        return answer.toString();
    }

    public List<String> decode(String str) {

        List<String> answer = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            int j = i;

            while (str.charAt(j) != '#') {

                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            j++;

            String word = str.substring(j, j + length);
            answer.add(word);

            i = j + length;
        }

        return answer;
    }
}
