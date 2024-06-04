package com.learning.preparation.day11_recursion_backtracking;

public class PowerOfNumbers {


    // https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

    public static void main(String[] args) {
        PowerOfNumbers powerOfNumbers = new PowerOfNumbers();
        System.out.println(powerOfNumbers.powerCalculate(11, 11));
        System.out.println(Math.pow(11, 11));
    }

    long powerCalculate(int N, int R) {
        return 1L;
    }


}
