package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int[] s =new int[a];
        for (int i = 0; i < a; i++) {
            int name=scan.nextInt();
            s[i]=name;
        }
        Checker checker = new Checker();
        checker.check(s,true);
    }
}
