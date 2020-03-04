package com.company;

public class Checker  {
    public boolean check(int[] a, boolean print){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]> a[i+1]){
                if(print){
                    System.out.println("NO");
                }
                return false;
            }
        }
        if(print){
            System.out.println("YES");
        }
        return true;
    }

}
