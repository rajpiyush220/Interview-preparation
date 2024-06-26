package com.learning.preparation.day13_dynamic_programming;

/*
Problem Description
    Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.

Problem Constraints
    1 <= A <= 10^5

Input Format
    First and only argument is an integer A.

Output Format
    Return an integer denoting the minimum count.

Example Input
    Input 1:
        A = 6
    Input 2:
        A = 5

Example Output
    Output 1:
        3
    Output 2:
        2

Example Explanation
Explanation 1:
    Possible combinations are : (12 + 12 + 12 + 12 + 12 + 12) and (12 + 12 + 22).
    Minimum count of numbers, sum of whose squares is 6 is 3.
Explanation 2:
    We can represent 5 using only 2 numbers i.e. 12 + 22 = 5
* */
public class MinimumNumberOfSquares {

    int[] squareCount;

    public static void main(String[] args) {
        MinimumNumberOfSquares squares = new MinimumNumberOfSquares();
        System.out.println(squares.countMinSquares(6));
        System.out.println(squares.countMinSquaresIterative(6));
    }

    public int countMinSquares(int A) {
        return 0;
    }


    public int countMinSquaresIterative(int A) {
        return 0;
    }
}
