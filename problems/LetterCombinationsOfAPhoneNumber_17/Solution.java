package problems.LetterCombinationsOfAPhoneNumber_17;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        findCombinations(digits, 0, new char[digits.length()], result, map);
        return result;
    }

    static void findCombinations(String digits, int i, char[] combination, List<String> list, Map<Integer, String> map) {
        if (i == digits.length()) {
            if (!new String(combination).equals(""))
                list.add(new String(combination));
            return;
        }

        for (int j = 0; j < map.get(digits.charAt(i) - '0').length(); j++) {
            combination[i] = map.get(digits.charAt(i) - '0').charAt(j);
            findCombinations(digits, i + 1, combination, list, map);
        }
    }

}
