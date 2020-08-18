package com.company.betterCodingStyle;

public class IfElseQuestionMark {

    public  int compare(int a, int b){
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    public int compareQuestionMarkStyle(int a, int b){
        int result = a < b ? a : b ;
        return result;
    }

    // by using QuestionMark

    public static void main(String[] args) {
        IfElseQuestionMark obj = new IfElseQuestionMark();
        System.out.println(obj.compare(4,8));
        System.out.println(obj.compareQuestionMarkStyle(4,8));
    }
}
