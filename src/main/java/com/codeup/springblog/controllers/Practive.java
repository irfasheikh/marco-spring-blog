package com.codeup.springblog.controllers;

public class Practive {
//    Alice and Bob were on a holiday. Both of them took many pictures of the places they've been, and now they want to show Charlie their entire collection. However, Charlie doesn't like these sessions, since the motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He tells them that he will only sit during the session if they show the same motive at most N times. Luckily, Alice and Bob are able to encode the motive as a number. Can you help them to remove numbers such that their list contains each number only up to N times, without changing the order?
//
//    Task
//    Given a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
//
//    Example
//EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
//            EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
//    FUNDAMENTALSLISTSDATA STRUCTURES


    //    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//
//    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
//
//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//
//
//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;


//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//
//
//            sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8

        public int sumDouble ( int a, int b){
            // Store the sum in a local variable
            int sum = a + b;

        }


//

//        public boolean makes10 ( int a, int b){
//            return (a == 10 || b == 10 || a + b == 10);
//        }
//    }
//}
