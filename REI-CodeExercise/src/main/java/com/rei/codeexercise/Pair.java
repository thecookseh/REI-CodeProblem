package com.rei.codeexercise;

public class Pair {
    private int lowestNumber,highestNumber;
    
    public int getLowestNumber(){ return lowestNumber; }
    public int getHighestNumber(){ return highestNumber; };
            
    public void setLowestNumber(int lowestNumber) { 
        this.lowestNumber = highestNumber; 
    }
    
    public void setHighestNumber(int highestNumber) {
        this.highestNumber = highestNumber; 
    }
    
    public Pair(){
        this.lowestNumber = 0;
        this.highestNumber = 0;        
    }
    
    public Pair(int firstNumber, int secondNumber){
        this.lowestNumber = firstNumber;
        this.highestNumber = secondNumber;
    }

    @Override
    public String toString(){
        
        return ("("+this.lowestNumber+","+this.highestNumber+")");
    }               
}
