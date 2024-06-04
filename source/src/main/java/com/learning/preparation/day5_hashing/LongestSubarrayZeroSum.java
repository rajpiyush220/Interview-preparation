package com.learning.preparation.day5_hashing;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Problem Description
    Given an array A of N integers.
    Find the length of the longest subarray in the array which sums to zero.
    If there is no subarray that sums to zero, then return 0.

Problem Constraints
    1 <= N <= 10^5
    -10^9 <= A[i] <= 10^9

Input Format
    Single argument, which is an integer array, A.

Output Format
     Returns an integer.

Example
    Input 1:
         A = [1, -2, 1, 2]
    Input 2:
         A = [3, 2, -1]

Example
    Output 1:
        3
    Output 2:
        0

Example
    Explanation 1:
         [1, -2, 1] is the largest subarray which sums up to 0.
    Explanation 2:
         No subarray sums up to 0.
* */
public class LongestSubarrayZeroSum {

    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(List.of(9, -20, -11, -8, -4, 2, -12, 14, 1))));

    }

    // https://www.scaler.com/academy/mentee-dashboard/class/155293/assignment/problems/27742
    public int solve(int[] A) {
        return 0;
    }

}
