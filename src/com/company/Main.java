package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
    }




    //Coding Bat Exercises

    /**
     * Return true if the given non-negative number is
     * a multiple of 3 or a multiple of 5. Use the % "mod"
     * operator -- see Introduction to Mod
     */

    //App Solution
    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    //My version of solution
    public boolean or35MyLogic(int n) {
        boolean result = false;
        if(n % 5 == 0 || n % 3 == 0){
            result = true;
        }
        return result;
    }



    /**
     * Given a string, take the first 2 chars and return
     * the string with the 2 chars added at both the front and back,
     * so "kitten" yields"kikittenki". If the string length is less than
     * 2, use whatever chars are there.
     */

    //App Solution
    public String front22(String str) {
        // First figure the number of chars to take
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }

    //My version of solution
    public String front22MyLogic(String str) {

        String firstTwoLetter = str.substring(0,2);
        if(str.length() < 2){
            return str + str + str;
        }

        return firstTwoLetter + str + firstTwoLetter;
    }



    /**
     *Given a string, return true if the string starts with
     *"hi" and false otherwise.
     * */

    //App Solution
    public boolean startHi(String str) {
        // First test if the string is not at least length 2
        // (so the substring() below does not go past the end).
        if (str.length() < 2) return false;

        // Pull out the string of the first two chars
        String firstTwo = str.substring(0, 2);

        // Test if it is equal to "hi"
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to: return(firstTwo.equals("hi"));
    }

    //My version of solution
    public boolean startHiMyLogic(String str) {
        boolean result = false;
        if(str.length() >= 2 && str.substring(0,2).contains("hi")){
            result = true;
        }
        return result;
    }



    /**
     * Given two temperatures, return true if one is less
     * than 0 and the other is greater than 100
     */

    //App Solution
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
        // Could be written as: return ((temp1 < 0 && ...));
    }

    //My version of solution
    public boolean icyHotMyLogic(int temp1, int temp2) {
        return((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100));
    }



    /**
     * Given 2 int values, return true if either of them is in the range
     * 10..20 inclusive.
     */

    //App Solution
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    //My version of solution
    public boolean in1020MyLogic(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }



    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     */


    //App Solution
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
               (b>=13 && b<=19) ||
               (c>=13 && c<=19);
    }

    //My version of solutions
    public boolean hasTeenMyLogic(int a, int b, int c) {
        return (a>=13 && a<=19) ||
               (b>=13 && b<=19) ||
               (c>=13 && c<=19);
    }










}
