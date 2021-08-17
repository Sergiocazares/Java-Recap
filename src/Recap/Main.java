package Recap;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] x = {-99,5,6,3,2,1,7,8,0};

        Arrays.sort(x, 1, 7);

        for (int i:x)
        {
            System.out.println(i + ",");
        }

    }

}
