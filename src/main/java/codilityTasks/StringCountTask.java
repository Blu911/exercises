package codilityTasks;

import java.util.ArrayList;
import java.util.List;

public class StringCountTask {

    static int solution(String s) {
        int index = 0;
        List<String> sentences = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.'
                    || s.charAt(i) == '?'
                    || s.charAt(i) == '!') {
                String sentence = s.substring(index, i)
                        .replaceAll("\\.?!*", "")
                        .trim();

                sentences.add(sentence);
                index = i;
            }
        }

        if (!(s.endsWith("?") || s.endsWith(".") || s.endsWith("!"))) {
            String substring = s.substring(index)
                    .replaceAll("\\.?!*", "")
                    .trim();
            sentences.add(substring);
        }

        int longestSentence = 0;

        for (String sentence : sentences) {
            String[] wordsArray = sentence.split(" ");
            int wordCount = 0;

            for (String word : wordsArray) {
                if (!word.isEmpty()) {
                    wordCount++;
                }
            }

            if (wordCount > longestSentence) {
                longestSentence = wordCount;
            }
        }
        return longestSentence;
    }
}
