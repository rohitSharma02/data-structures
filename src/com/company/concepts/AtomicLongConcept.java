package com.company.concepts;

import java.util.concurrent.atomic.AtomicLong;

// If working with threads it's better to work with atomic long instead of long.
public class AtomicLongConcept {
    public static void main(String[] args){
        AtomicLong val = new AtomicLong(12);
        AtomicLong val2 = new AtomicLong(44);
// data type: long
        long res = val.longValue();
        long res1 = val2.longValue();
        long add = res+res1;
// data type: String
        String res3 = val.toString();

        System.out.println("Value:"+add);
        System.out.println("Value string :"+res3);
        System.out.println("Data type of res3: "+res3.getClass().getName());

    }
}
