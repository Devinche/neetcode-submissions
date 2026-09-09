class Solution {
    public List<String> stringMatching(String[] words) {

        String sub = words[0];
        List<String> answer = new ArrayList<>();

        // for (int i = 1; i < words.length; i++) {

        //     if (words[i].contains(sub)) {

        //         answer.add(sub);
        //         sub = words[i];
        //     }
        // }

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {

                if (words[i] != words[j] && words[i].contains(words[j]) && !answer.contains(words[j])) {

                    answer.add(words[j]);
                }
            }
        }

        return answer;

    }
}