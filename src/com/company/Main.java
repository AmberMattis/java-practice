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
        if (n % 5 == 0 || n % 3 == 0) {
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

        String firstTwoLetter = str.substring(0, 2);
        if (str.length() < 2) {
            return str + str + str;
        }

        return firstTwoLetter + str + firstTwoLetter;
    }


    /**
     * Given a string, return true if the string starts with
     * "hi" and false otherwise.
     */

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
        if (str.length() >= 2 && str.substring(0, 2).contains("hi")) {
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
        return ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100));
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
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

    //My version of solutions
    public boolean hasTeenMyLogic(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }


    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     */

    //App Solution
    public boolean loneTeen(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }

    //My Version of solution
    public boolean loneTeenMyLogic(int a, int b) {

        boolean result = false;
        boolean aIsTeen = (a >= 13 && a <= 19);
        boolean bIsTeen = (b >= 13 && b <= 19);

        if ((aIsTeen && !bIsTeen) || (bIsTeen && !aIsTeen)) {
            result = true;
        }
        return result;
    }



    /**
     * Given a string, if the string "del" appears starting at index 1, return a string where that
     * "del" has been deleted. Otherwise, return the string unchanged.
     */

    //App Version
    public String delDel(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }

        return str;
    }

    //My version of the solution
    public String delDelMyLogic(String str) {

        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }

        return str;
    }



    /**
     * Return true if the given string begins with "mix", except the 'm' can be anything,
     * so "pix", "9ix" .. all count.
     */

    //App Solution
    public boolean mixStart(String str) {
        // Check if string is too small
        // (so substring() below does not go off the end)
        if (str.length() < 3) return false;

        // Pull out length 2 string for the "ix" part
        // (i.e. substring starting at index 1 and stopping just before 3).
        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to just:
        // return(two.equals("ix"));
    }


    //My version of the solution
    public boolean mixStartMyLogic(String str) {

        boolean inTheMix = false;

        if(str.length() >= 3 && str.substring(1,3).equals("ix")){
            inTheMix = true;
        }

        return inTheMix;

    }


    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only
     * if it is 'z', so "ozymandias" yields "oz".
     */

    //App Solution
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }


    //My version of the solution
    public String startOzMyLogic(String str) {
        boolean longEnough = str.length() >= 2;
        String answer = "";

        if(str.substring(0,1).equals("o")){
            answer = str.substring(0,1);
        }

        if(longEnough && str.substring(1,2).equals("z")){
            answer = str.substring(1,2);
        }

        if(longEnough && str.substring(0,2).equals("oz")){
            answer = str.substring(0,2);
        }

        return answer;

    }


    /**
     * Given three int values, a b c, return the largest.
     */

    //App Solution
    public int intMax(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }

    //My version of solution
    public int intMaxMyLogic(int a, int b, int c) {
        boolean largeA = (a > b && a > c);
        boolean largeB = (b > a && b > c);
        boolean largeC = (c > b && c > a);
        int answer = 0;

        if(largeA){
            answer = a;
        }
        if(largeB){
            answer = b;
        }
        if(largeC){
            answer = c;
        }
        return answer;
    }



    /**
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
     * value of a number.
     */

    //App Solution
    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff

        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
        // Could have "else" before the second if and the return 0.
    }

    //My version of the solution
    public int close10MyLogic(int a, int b) {
        int num = 0;
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if(a == b){
            num = num;
        }

        if(aDiff > bDiff){
            num = b;
        }

        if(aDiff < bDiff){
            num = a;
        }

        return num;
    }
}



