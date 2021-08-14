package problems.ReverseInteger_7;

class Solution {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        stringBuilder.reverse();
        try {
            if(stringBuilder.toString().endsWith("-")) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                return - Integer.parseInt(stringBuilder.toString());
            }
            return Integer.parseInt(stringBuilder.toString());
        }catch (NumberFormatException ignored) {

        }

        return 0;
    }
}
