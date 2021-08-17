package Recap;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String h = "hello";
        h.length();

        System.out.println(str("hi"));

    }

    public static void tim(String str, int x){
        for(int i = 0; i < x; i++){
            System.out.println(str);
        }
    }

    public static int add2(int x){
        return x + 2;
    }

    public static String str (String x){
        return x + "!";
    }

}
