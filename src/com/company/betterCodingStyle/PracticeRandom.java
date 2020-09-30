package com.company.betterCodingStyle;
// 1. Checking how forEach loop works in java and also
// 2. How continue, break works
// 3. How to use switch statements

public class PracticeRandom {
    public static void main(String[] args){
        String s = "((()))}}";
        int minOpen = 0, maxOpen = 0;

        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                minOpen++;
                maxOpen++;
                System.out.println("minOpen:"+minOpen);
                System.out.println("maxOpen:"+minOpen);
            } else if (c == ')' || c == '}' || c == ']') {
                minOpen--;
                maxOpen--;
                System.out.println("else if minOpen:"+minOpen);
                System.out.println("else if maxOpen:"+maxOpen);
            } else {
                minOpen--;
                maxOpen++;
                System.out.println("else minOpen:"+minOpen);
                System.out.println("else maxOpen:"+maxOpen);
            }
            if (maxOpen < 0) {
                System.out.println("false");
            }
            minOpen = Math.max(minOpen, 0);
            System.out.println("Math max ,maxOpen:"+maxOpen);
        }
    }
}
