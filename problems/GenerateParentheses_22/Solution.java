package problems.GenerateParentheses_22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(2));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        bracket(list, n, "", 0, 0);
        return list;
    }

    public static void bracket(List<String> list, int count, String str, int left, int right){

        if (left == count && right == count) {
            list.add(str);
        }
        else
        {
            if (left<count)
                bracket(list, count, str + '(', left+1, right);
            if (right<left)
                bracket(list, count, str + ')', left, right+1);
        }
    }
}
