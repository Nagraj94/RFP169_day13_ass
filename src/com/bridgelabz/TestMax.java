package com.bridgelabz;

public class TestMax {

    public static void main(String[] args) {
        String a = "Apple";
        String b = "Peach";
        String c = "Banana";
        String max;

        max = a;
        if (b.compareTo(max)>0){
            max = b;
        }
        if (c.compareTo(max)>0){
            max = c;
        }
        System.out.println("maximum string value among 'Peach','Apple','Banana' is: "+max);
    }
}
