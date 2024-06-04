package com.learning.preparation.day7_linkedlist;

import mock_preparation.ListNode;

import java.util.HashSet;

public class RemoveLoopFromLinkedList {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode root2 = new ListNode(3);
        ListNode root3 = new ListNode(4);

        root.next = root2;
        root2.next = root3;
        root3.next = root2;

        solve(root).printAll();

    }

    // https://www.scaler.com/academy/mentee-dashboard/class/155287/assignment/problems/4226
    public static ListNode solve(ListNode A) {
        return null;
    }
}