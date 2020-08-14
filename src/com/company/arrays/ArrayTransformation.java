package com.company.arrays;
// Leetcode Problem 1243
// Brute Force
public class ArrayTransformation {
     // arr[i-1] --> arr [i]
    //  Small than l,r neighbor --> ++
    //  Bigger than l,r neighbor --> --

    public static void main(String[] args){
        //int[] preDay = {6,2,3,4};
        int[] preDay = {1,6,3,4,3,5};
        //System.out.println(preDay.length);
        int[] currentDay = new int[preDay.length];

        //Condition for comparing
        // 1,6,3
        // if no value exist before array then move to next array

        // Complexity so far O(n)
        for (int i = 1; i < preDay.length-1 ; i++){
              //example value 1,6,3 when index i =1
            //System.out.print(" "+ preDay[i]+ " ");
            //System.out.println(i + " : " + preDay[i]);

            // ?????????????????????????????????????
            // Baar baar compare karna hain toh kya karenge?
            // loop comparison ki ek baar chal rhi hain bass

              if(preDay[i-1] > preDay[i] && preDay[i+1] > preDay[i]){
                 preDay[i] += 1;

              }else if(preDay[i-1] < preDay[i] && preDay[i+1] < preDay[i]){
                  preDay[i] -= 1;
              }
           System.out.print("  "+ preDay[i]+ " ");
        }

    }

}
