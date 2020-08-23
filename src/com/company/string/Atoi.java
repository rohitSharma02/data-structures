package com.company.string;
// String to Integer
//Example 1:
//
//        Input: "42"
//        Output: 42
//Example 2:
//
//        Input: "   -42"
//        Output: -42
//        Explanation: The first non-whitespace character is '-', which is the minus sign.
//        Then take as many numerical digits as possible, which gets 42.
//Example 3:
//
//        Input: "4193 with words"
//        Output: 4193
//        Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
//Example 4:
//
//        Input: "words and 987"
//        Output: 0
//        Explanation: The first non-whitespace character is 'w', which is not a numerical
//        digit or a +/- sign. Therefore no valid conversion could be performed.
//Example 5:
//
//        Input: "-91283472332"
//        Output: -2147483648
//        Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
//        Thefore INT_MIN (−231) is returned.
public class Atoi {

    public static int strToInt(String str) {
        int result = 0;
        int i = 0;
        int sign = 1;
        // If String is null
        if(str.length() == 0) return 0;
        // for whitespaces
        // Double commas in bottom line causing issue ????????????????????
        // while(i < str.length() && str.charAt(i) == " " ){
        while (i < str.length() && str.charAt(i) == ' ')
            i++;
            // for sign
            if (i < str.length() && str.charAt(i) == '+' || str.charAt(i) == '-') {
                //looping at charAt(i++)
                sign = (str.charAt(i++) == '-') ? -1 : 1;
            }
                //Check for overflow and underflow
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    if (result > Integer.MAX_VALUE / 10 ||
                            (result == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                        return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    result = result * 10 + (str.charAt(i++) - '0');
                }
        return result * sign;
    }
        // Driver Class
        public static void main (String[]args){
            String inp = "22";
            System.out.println(strToInt(inp));
        }
    }
