package problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Solution1 {

    public static void main(String[] args) {
        String[] strings = {"dvd", "abc", "abf"};
//        System.out.println(new Solution1().longestPrefix(strings));

//        List<Integer> integers = List.of(1, 2, 3, 4, 5, 1, 1, 1, 2, 3, 4, 5, 5, 5);
//        System.out.println(new Solution1().calculateRepeats(integers));

//        System.out.println(calculateSum1("121212421"));
//        System.out.println(calculateSum2("121212421"));

        int[] nums = {1, 2, 4, 6, 7};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }

    //{1, 2, 4, 6, 7}, target = 10
    //return {4, 6}
    public static int[] twoSum(int[] nums, int targetSum) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            int x = targetSum - i;
            if (!set.contains(x)) {
                set.add(i);
                continue;
            }
                return new int[]{i, x};
        }
        return null;
    }
//    public static int[] twoSum(int[] nums, int targetSum) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int x = targetSum - nums[i];
//            if (map.containsKey(x) && map.get(x) != i) {
//                return new int[]{i, map.get(targetSum - nums[i])};
//            }
//        }
//        return null;
//    }

//    public static Integer calculateSum1(String input) {
//        long start = System.currentTimeMillis();
//        int result = 0;
//        int num = 0;
//        try {
//            num = Integer.parseInt(input);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        while (num != 0) {
//            result += num % 10;
//            num /= 10;
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println(end - start + " with while");
//        return result;
//    }
//
//    public static Integer calculateSum2(String input) {
//        long start = System.currentTimeMillis();
//        int result ;
//
//        String[] strings = input.split("");
//        result = Arrays.stream(strings).map(Integer::parseInt).reduce(0, (x, y) -> x+y);
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - start + " with stream");
//        return result;
//    }

//    public Map<Integer, Integer> calculateRepeats(List<Integer> input) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(Integer i: input) {
//            if (map.containsKey(i)) {
//                map.put(i, map.get(i) + 1);
//                continue;
//            }
//            map.put(i, 1);
//        }
//        return map;
//    }



    public String longestPrefix(String[] strings) {
        String prefix = "";
        int x = 1;
        String subStr = strings[0].substring(0, x);
        while (true) {
            for (int i = 0; i < strings.length; i++) {
                if (!strings[i].startsWith(subStr)) {
                    return prefix;
                }
            }
            prefix = subStr;
            subStr = strings[0].substring(0, ++x);
        }
    }
}
