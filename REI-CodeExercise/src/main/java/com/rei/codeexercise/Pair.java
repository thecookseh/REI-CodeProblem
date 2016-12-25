package com.rei.codeexercise;

/***
 * COMPLETE 2204 20161224
 * @author jerem
 */
public class Pair {
    private int lowestNumber,highestNumber;
    
    public int getLowestNumber(){ return lowestNumber; }
    public int getHighestNumber(){ return highestNumber; };
            
    public void setLowestNumber(Integer lowestNumber) { 
        this.lowestNumber = highestNumber; 
    }
    
    public void setHighestNumber(Integer highestNumber) {
        this.highestNumber = highestNumber; 
    }
    
    public Pair(){
        this.lowestNumber = 0;
        this.highestNumber = 0;        
    }
    
    public Pair(int firstNumber, Integer secondNumber){
        this.lowestNumber = firstNumber;
        this.highestNumber = secondNumber;
    }

    @Override
    public String toString(){
        
        return ("("+this.lowestNumber+","+this.highestNumber+")");
    }               
}
