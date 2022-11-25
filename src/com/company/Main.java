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

        if (str.length() >= 3 && str.substring(1, 3).equals("ix")) {
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

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }


    //My version of the solution
    public String startOzMyLogic(String str) {
        boolean longEnough = str.length() >= 2;
        String answer = "";

        if (str.substring(0, 1).equals("o")) {
            answer = str.substring(0, 1);
        }

        if (longEnough && str.substring(1, 2).equals("z")) {
            answer = str.substring(1, 2);
        }

        if (longEnough && str.substring(0, 2).equals("oz")) {
            answer = str.substring(0, 2);
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

        if (largeA) {
            answer = a;
        }
        if (largeB) {
            answer = b;
        }
        if (largeC) {
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

        if (a == b) {
            num = num;
        }

        if (aDiff > bDiff) {
            num = b;
        }

        if (aDiff < bDiff) {
            num = a;
        }

        return num;
    }


    /**
     * Given 2 int values, return true if they are both in the range 30..40 inclusive,
     * or they are both in the range 40..50 inclusive.
     */

    //App Solution
    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
        // This could be written as one very large expression,
        // connecting the two main parts with ||
    }

    //My version of solution
    public boolean in3050MyLogic(int a, int b) {
        boolean inRange3040 = ((a >= 30 && a <= 40) && (b >= 30 && b <= 40));
        boolean inRange4050 = ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));

        return (inRange3040 || inRange4050);

    }


    /**
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     */

    //App Solution
    public int max1020(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    //My version of solution
    public int max1020MyLogic(int a, int b) {
        int result = 0;
        boolean aInRange = (a >= 10 && a <= 20);
        boolean bInRange = (b >= 10 && b <= 20);
        boolean noneInRange = (a < 10 && a > 20) && (b < 10 && b > 20);
        boolean bothInRange = (a >= 10 && a <= 20) && (b >= 10 && b <= 20);

        if (bothInRange && a > b) {
            result = a;
        }
        if (bothInRange && b > a) {
            result = b;
        }
        if (aInRange && !bInRange) {
            result = a;
        }
        if (bInRange && !aInRange) {
            result = b;
        }
        if (noneInRange) {
            result = result;
        }

        return result;
    }


    /**
     * Return true if the given string contains between 1 and 3 'e' chars.
     */

    //App solution
    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }

        return (count >= 1 && count <= 3);
    }

    //My version of solution
    public boolean stringEMyLogic(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }


    /**
     * Given two non-negative int values, return true if
     * they have the same last digit, such as with 27 and 57.
     * Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
     */

    //App solution
    public boolean lastDigit(int a, int b) {
        // True if the last digits are the same
        return (a % 10 == b % 10);
    }

    //My version of solution
    public boolean lastDigitMyLogic(int a, int b) {
        int modA = a % 10;
        int modB = b % 10;
        boolean result = false;

        if (modA == modB) {
            result = true;
        }
        return result;
    }

    /**
     * Given a string, if the string "del" appears starting at index 1,
     * return a string where that "del" has been deleted. Otherwise, return
     * the string unchanged.
     */

    //App version
    public String delDel2(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }

    //My version of solution
    public String delDel2MyLogic(String str) {
        boolean del = str.length() >= 4 && str.substring(1, 4).equals("del");
        String result = str;

        if (del) {
            result = str.substring(0, 1) + str.substring(4);
        }
        return result;
    }

    /**
     * Given a string, return a new string where the last 3 chars are now in upper case.
     * If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase()
     * returns the uppercase version of a string.
     */

    //App Version
    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    //My version of solution
    public String endUpMyLogic(String str) {

        if(str.length() < 3){
            return str.toUpperCase();
        }

        //Logic for targeting the last three charactures in a string
        int cut = str.length() - 3;
        //Logic for targetting all but the last 3 charatures in a string;
        String front = str.substring(0, cut);
        //Logic for grabbing the last three charatures in a string.
        String back  = str.substring(cut);
        //Logic for grabbing the string with the last three charactures capatalized
        String capsEnd = front + back.toUpperCase();

        return capsEnd;
    }

    /**
     *
     * Given a non-empty string and an int N, return the string made starting with char 0,
     * and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
     */

    //App Version
    public String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    //My version of solution
    public String everyNthMyLogic(String str, int n) {
        //Set the string variable to an empty string
        String result = "";

        //Iterate over the string based on the
        //int n and add the characture (i) to the result string
        for(int i = 0; i < str.length(); i = i+n){
            result = result + str.charAt(i);
        }

        //Return the result string
        return result;
    }

    /**
     *  Given a string and a non-negative int n, return a larger string that
     *  is n copies of the original string.
     */

    //App Version
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }

    //My version of solution
    public String stringTimesMyLogic(String str, int n) {
        String result = "";

        for(int i = 0; i < n; i++){
            result = result + str;
        }

        return result;
    }


    /**Given a string and a non-negative int n, we'll say that the front of the string is the
     * first 3 chars, or whatever is there if the string is
     * less than length 3. Return n copies of the front;
     */

    //App Solution
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }

    //My version of solution
    public String frontTimesMyLogic(String str, int n) {
        String front = str.substring(0,3);
        String result = "";

        for(int i = 0; i < n; i++){
            if(str.length() >= 3){
                result = result + front;
            }

        }
        return result;
    }


    /**
     * Count the number of "xx" in the given string. We'll say that overlapping
     * is allowed, so "xxx" contains 2 "xx"
     */

    //App Solution
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    // Solution notes: the loop is shortened to end at str.length()-1
    // so we can pull out a length 2 substring without going out of bounds.
    // Remember to use equals() to compare strings, not ==.

    //My version of solution
    int countXXMyLogic(String str) {
        int pairs = 0;

        for(int i = 0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")){
                pairs = pairs + 1;
            }
        }
        return pairs;
    }

    /**
     * Given a string, return true if the first instance of "x"
     * in the string is immediately followed by another "x".
     */

    //App Solution
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }









}




