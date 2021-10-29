package problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(new Solution1().printTextPerRole(roles, textLines));
    }

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            builder.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i].concat(":"))) {
                    builder.append(j + 1).append(") ").append(textLines[j].substring(textLines[j].indexOf(":") + 2))
                    .append("\n");
                }
            }
            builder.append("\n");
        }

        return builder.toString();
    }


//    public static boolean isPowerOfTwo(int value) {
//        return Integer.bitCount(Math.abs(value)) == 1;
//    }
//
//    public static boolean isPalindrome(String text) {
//        String string = text.replaceAll("[^a-zA-Z0-9]", "");
//        StringBuilder builder = new StringBuilder(string);
//        return builder.reverse().toString().equalsIgnoreCase(string);
//    }
}
