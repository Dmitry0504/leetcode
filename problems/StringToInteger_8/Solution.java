package problems.StringToInteger_8;

import java.util.List;

class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty()) return 0;
        String str = s.trim();
        if (str.isEmpty()) return 0;
        if (str.matches("\\D")) return 0;
        if (str.matches("\\D{2,}.*")) return 0;

        List<Character> characters = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        List<Character> characters2 = List.of('-', '+', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

        if (!characters2.contains(str.charAt(0))) return 0;

        if (str.startsWith("-")) {
            StringBuilder stringBuilder = new StringBuilder("-");
            for (char c : str.substring(1).toCharArray()) {
                if (!characters.contains(c)) break;
                stringBuilder.append(c);
            }

            try {
                return Integer.parseInt(stringBuilder.toString());
            } catch (NumberFormatException e) {
                return Integer.MIN_VALUE;
            }
        }

        if (str.startsWith("+")) {
            StringBuilder stringBuilder = new StringBuilder("+");
            for (char c : str.substring(1).toCharArray()) {
                if (!characters.contains(c)) break;
                stringBuilder.append(c);
            }

            try {
                return Integer.parseInt(stringBuilder.toString());
            } catch (NumberFormatException e) {
                return Integer.MAX_VALUE;
            }
        }

        StringBuilder stringBuilder = new StringBuilder("");
        for (char c : str.toCharArray()) {
            if (!characters.contains(c)) break;
            stringBuilder.append(c);
        }

        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
}