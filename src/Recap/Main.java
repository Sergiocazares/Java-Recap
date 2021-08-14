package Recap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        List<Integer> t = new LinkedList<Integer>();
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.get(0);
        t.set(1, 5);
        t.subList(1, 3);

        System.out.println(t.subList(1, 4));
    }

}
