package Recap;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Dog sergio = new Dog("sergio", 4);
        sergio.speak();
        Dog bill = new Dog("bill", 4);
        bill.speak();
        Dog bob = new Dog("bob", 11);
        bob.speak();

        sergio.speak();

    }
}
