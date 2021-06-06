import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public int lengthOfLongestSubstring(String substring) {

        char[] charArray = substring.toCharArray();
        List<Character> finalList = new ArrayList<>();
        List<Character> workList = new ArrayList<>();
        List<Character> transitionList = new ArrayList<>();
        int repeatedCharacterPosition, finalListPosition;

        for (char charTemp : charArray) {
            if (!workList.contains(charTemp)) {
                workList.add(charTemp);
            } else {
                if (workList.size() >= finalList.size()) {
                    finalList.clear();
                    finalList.addAll(workList);
                    workList.clear();
                    repeatedCharacterPosition = finalList.indexOf(charTemp) + 1;
                    finalListPosition = finalList.size();
                    transitionList.clear();
                    transitionList.addAll(finalList.subList(repeatedCharacterPosition, finalListPosition));
                    workList.addAll(transitionList);
                    workList.add(charTemp);
                }
            }
        }

        if (workList.size() > finalList.size()) {
            finalList.clear();
            finalList.addAll(workList);
        }

        return finalList.size();
    }

}
