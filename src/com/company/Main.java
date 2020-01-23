/*
Tanner Gragg
CSCI 1660
1/23/2020
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[]highTemp = {45,29,10,22,41,28,33};
        int[]precipChance = {95,60,25,5,0,75,90};

        for(int i=0; i<day.length; i++){
            if(highTemp[i] < 32 & precipChance[i] > 50){
                System.out.println(day[i]);
            }
        }
    }
}