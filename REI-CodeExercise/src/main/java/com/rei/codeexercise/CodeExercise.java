package com.rei.codeexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

// STARTED 2130 20161224
public class CodeExercise {       
   
    /***
     * COMPLETE 2312 20161224
     * @param input
     * @return 
     */
    public static String getIncreasingRanges(int[] input){
        ArrayList<Pair> pairs = new ArrayList<>();
        Pair lastPair = null;
        for(int i = 0;i<input.length;i++) {  
            int lowNumber = i==0 ? 0 : getLowestNumberIndex(i, input);
            int highNumber = getHighestNumberIndex(lowNumber, input);
            Pair newPair = new Pair(lowNumber, highNumber);            
            pairs.add(newPair);
            lastPair = newPair;
            i = newPair.getHighestNumber();
        }
        return generateOutput(pairs);
    }
    
    /***
     * COMPLETE 2228 20161224
     * @param sets
     * @return 
     */    
    public static String generateOutput(ArrayList<Pair> sets) {
        StringBuilder stringBuilder = new StringBuilder(sets.size()); // SB will have to resize. slight performance hit but negligable
        Iterator iterator = sets.iterator();
        while(iterator.hasNext()) {
           stringBuilder.append(iterator.next().toString());
        }
        return stringBuilder.toString();
    }
      
    /***
     * Complete 2250 20161224
     * @param beginIndex
     * @param input
     * @return 
     */
    public static int getLowestNumberIndex(int beginIndex, int[] input) { 
        try {
            if(input[beginIndex] > input[beginIndex +1] || input[beginIndex] == input[beginIndex + 1]) {
                return getLowestNumberIndex(beginIndex + 1, input);
            } else {
                return beginIndex;
            }                            
        } catch(ArrayIndexOutOfBoundsException ex){
            return beginIndex;
        }
    }

    /***
     * Complete 2255 20161224
     * @param beginIndex
     * @param input
     * @return 
     */
    public static int getHighestNumberIndex(int beginIndex , int[] input) {     
        try {
            if(input[beginIndex] < input[beginIndex +1] && input[beginIndex] != input[beginIndex + 1]) {
                return getHighestNumberIndex(beginIndex + 1, input);
            } else {
                return beginIndex;
            }                            
        } catch(ArrayIndexOutOfBoundsException ex){
            return beginIndex;
        }
    }

}
 /*
  Coding Exercise
a.       Write a function that takes an array of ints and returns a set of pairs denoting the increasing ranges.  Please code in Java.
b.      Example input:[1,2,3,4,5,6,3,6,8,5,8,9,4,3,5] pairs returned: (0,5)(6,8)(9,11)(13,14)
c.       You can email me if you have any questions, but of course you can make some design decisions from these requirements too. 
d.      Please reply to acknowledge you received this question
e.      Please include in your respond your Start and Stop Times for this exercise
f.        At the completion of the exercise please send your .java files, or post your project on GitHub or something (we don’t accept .zip attachments)
*/