package com.bridgelabz;

public class Hobbies {
    public static void main(String[] args) {

        String hobbieArray[] = {"Football", "Swimming","Cricket"};

        System.out.print("My Hobbies are");


        for (int j = 0; j < hobbieArray.length; j++) {
            System.out.print(" ");
            System.out.print(hobbieArray[j]);
            if (j != hobbieArray.length-1) {
                System.out.print(",");
            } else {
                System.out.print(".");
            }
        }


    }


}

