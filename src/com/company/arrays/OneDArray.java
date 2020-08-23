package com.company.arrays;

public class OneDArray {
    int arr[] = null;

    // Constructor
    public OneDArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i =0 ; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //Traverse Array
    public void traverseArray(){
        try{
            for (int i = 0; 1 < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
                System.out.println("Arrays no longer exist");
        }
    }
}
