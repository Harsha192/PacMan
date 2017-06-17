package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n= 180;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < n ; i++) {
            String v = Integer.toString(i);
            String[] array = v.split("");
            int val = 0;
            for (int j = 0; j < array.length; j++) {
                val+= Integer.parseInt(array[j]);

            }
            if (val>=sum){
                sum = val;
                number = i;
            }

        }
        System.out.println(number);
    }
}
