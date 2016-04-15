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

   public void setCalculator(){
      this.calculator = new Calculator(this.plan.toLowerCase(), this.numberOfLine, this.callTime);
      setUserTotalCharge();
   }
   
   public float getUserTotalCharge() {
      return totalCharge;
   }

   public void setUserTotalCharge() {
      this.totalCharge = (float)calculator.totalCharge();
   }
}
