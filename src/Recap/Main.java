package Recap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int[] arr = {1,5,7,3,4,5,};

        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 5) {
                System.out.println("Found a 5! at index " + i);
            }
        }

    }

}
