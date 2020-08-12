package org.kangdw.leetcode;

import java.util.*;

/**
 * 华为算法题（#20有效的括号）
 */
public class ValidBrackets {

    public static void main(String[] args) {
        String str = "(()[]{})(()[]{})";
        int i = 3;
        boolean valid = isValid(str);
        System.out.println(valid);
    }

    /**
     * 自己的解题方法
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        int strLength = s.length();
        //判断长度为0,则视为有效
        if (strLength == 0) {
            return true;
        }
        //长度为奇数,则肯定无效
        if (strLength % 2 != 0) {
            return false;
        }

        //长度为偶数
        List<String> list = Arrays.asList(s.split(""));
        //TODO 这个地方返回的 Arrays.asList 不是java.util的List
        List array = new ArrayList(list);
        //这个地方不能i++,否则置0以后又++ 会变成1
        for (int i = 0; i < array.size() - 1; ) {
            if (array.get(i).equals("(") && array.get(i + 1).equals(")")) {
                //必须先移除后面的，否则index会变
                array.remove(i + 1);
                array.remove(i);
                i = 0;
                continue;
            }
            if (array.get(i).equals("[") && array.get(i + 1).equals("]")) {
                array.remove(i + 1);
                array.remove(i);
                i = 0;
                continue;
            }
            if (array.get(i).equals("{") && array.get(i + 1).equals("}")) {
                array.remove(i + 1);
                array.remove(i);
                i = 0;
                continue;
            }
            i++;
        }
        if (array.size() > 0) {
            return false;
        }
        return true;
    }

    public static boolean isValid2(String s) {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');

        int strLength = s.length();
        //判断长度为0,则视为有效
        if (strLength == 0) {
            return true;
        }
        //长度为奇数,则肯定无效
        if (strLength % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        // String str = "(()[]{})(()[]{})";
        for (int i = 0; i < strLength; i++) {
            char c = s.charAt(i);
            if (bracketsMap.containsKey(c)) {
                Character top = stack.empty() ? '!' : stack.pop();
                if (top != bracketsMap.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
