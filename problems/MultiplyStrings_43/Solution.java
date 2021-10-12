package problems.MultiplyStrings_43;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int[] resArray =  new int[n + m];
        for(int i = n - 1;  i >= 0; i --) {
            for(int j = m - 1; j >= 0; j --) {
                int valIdx = i + j + 1;
                int carryIdx = i + j;
                int product = (num1.charAt(i) - '0')  * (num2.charAt(j) - '0');
                product += resArray[valIdx];
                resArray[valIdx] = product % 10;
                resArray[carryIdx] += product / 10;
            }
        }
        int nonZeroIdx = 0;
        for(int num : resArray) {
            if (num != 0) {
                break;
            }
            nonZeroIdx++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = nonZeroIdx; i < resArray.length; i++) {
            sb.append(resArray[i]);
        }

        return sb.toString();

    }


}
