package com.your.dream.team14;

public class User implements Users{
   private Calculator calculator;
   private float totalCharge;
   private int callTime;
   private int numberOfLine;
   private String plan;
   
   public User(String aPlan, int aCallTime, int aNumberOfLine){
      this.plan = aPlan;
      this.callTime = aCallTime;
      this.numberOfLine = aNumberOfLine;
      setCalculator();
   }
   @Override
   public void setCalculator(){
      this.calculator = new Calculator(this.plan.toLowerCase(), this.numberOfLine, this.callTime);
      setUserTotalCharge();
   }
   
   @Override
   public float getUserTotalCharge() {
      return totalCharge;
   }
   
   @Override
   public void setUserTotalCharge() {
      this.totalCharge = (float)calculator.totalCharge();
   }
}
