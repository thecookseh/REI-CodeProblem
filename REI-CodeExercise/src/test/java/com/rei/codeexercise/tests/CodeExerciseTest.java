package com.rei.codeexercise.tests;

import com.rei.codeexercise.CodeExercise;
//import com.rei.codeexercise.Pair;
//import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author jerem
 */
public class CodeExerciseTest {
    
    public CodeExerciseTest() {
    }

    @Test
    public void getIncreasingRangesTest(){
        int[] testInput = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};
        String testResults = "(0,5)(6,8)(9,11)(13,14)";
        Assert.assertEquals(testResults, CodeExercise.getIncreasingRanges(testInput));
    }
//// TESTS FOR NOW PRIVATE METHODS.  LEFT HERE FOR LATER POSSIBLE TESTING AND REVIEW    
//    @Test
//    public void getHighestNumberIndexTest(){
//        int[] testInput = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};
//        Assert.assertEquals(5,CodeExercise.getHighestNumberIndex(1, testInput));
//        Assert.assertEquals(8,CodeExercise.getHighestNumberIndex(7, testInput));
//        Assert.assertEquals(11,CodeExercise.getHighestNumberIndex(10, testInput));
//        Assert.assertEquals(14,CodeExercise.getHighestNumberIndex(14, testInput));
//    }
//    
//    @Test
//    @SuppressWarnings("AssertEqualsBetweenInconvertibleTypes")
//    public void getLowestNumberIndexTest(){
//            int[] testInput = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};
//            Pair[] testPair ={ 
//                new Pair(0,5), // base case
//                new Pair(6,8), 
//                new Pair(9,11), 
//                new Pair(13,14)
//            };
//            Assert.assertEquals(0, CodeExercise.getLowestNumberIndex(0, testInput)); // base case
//            Assert.assertEquals(6, CodeExercise.getLowestNumberIndex(testPair[0].getHighestNumber(), testInput));
//            Assert.assertEquals(9, CodeExercise.getLowestNumberIndex(testPair[1].getHighestNumber(), testInput));
//            Assert.assertEquals(13,CodeExercise.getLowestNumberIndex(testPair[2].getHighestNumber(), testInput));       
//    }
//    
//    @Test
//    public void generateOutputTest() {
//        ArrayList<Pair> testInput = new ArrayList<>();
//        String testResults = "(0,5)(6,8)(9,11)(13,14)";
//        
//        testInput.add(new Pair(0,5)); 
//        testInput.add(new Pair(6,8));
//        testInput.add(new Pair(9,11));
//        testInput.add(new Pair(13,14));
//        Assert.assertEquals(testResults, CodeExercise.generateOutput(testInput));
//    }
}