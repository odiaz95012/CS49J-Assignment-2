package edu.sjsu.assignment2;

/**
 * This class uses recursion to find the starting position of String 2 in String 1.
 */
public class MyRecursion {
    /**
     * @param text - the string we're traversing to find the starting position of String 2.
     * @param str - The string we're trying to find the starting position.
     * @return
     */
    public static int indexOf(String text, String str){
        return indexOf(text, str,0);
    }

    /**
     * This is a recursive helper function to find the index of the starting position of String 2 in String 1.
     * @param text - the string we're traversing.
     * @param str - the string we're trying to find.
     * @param index - the starting position of String str in String text.
     * @return recursive function with the first character cut out of String text and index incremented by 1.
     */
    private static int indexOf(String text, String str, int index){
        if(text.length() < str.length()) return -1;
        else if(text.startsWith(str)) return index;
        else return indexOf(text.substring(1), str, index + 1);
    }

}

