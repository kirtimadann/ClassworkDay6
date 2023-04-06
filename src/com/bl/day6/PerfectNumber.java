package com.bl.day6;

public class PerfectNumber {


    public static void main(String[] args) {
        PerfectNumber obj = new PerfectNumber();


        int num =497;
        int sum =0;
        for (int i=1; i<num; i++){

            if(num%i == 0 ){

                sum = sum + i;

            }
        }

        if (sum == num){

            System.out.println("This is Perfect num");
        }
        else {
            System.out.println("this is not Perfect num");
        }

    }
}
