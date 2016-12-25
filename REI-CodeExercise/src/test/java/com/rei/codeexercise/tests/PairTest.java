package com.rei.codeexercise.tests;

import com.rei.codeexercise.Pair;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author jerem
 */
public class PairTest {
    
    public PairTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void toStringTest(){
        Pair defaultPair = new Pair();
        Pair nonDefaultPair = new Pair(5,9);        
        Assert.assertEquals("(0,0)", defaultPair.toString());        
        Assert.assertEquals("(5,9)", nonDefaultPair.toString());
    }
}
