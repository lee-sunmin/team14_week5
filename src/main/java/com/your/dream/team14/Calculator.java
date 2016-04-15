package com.your.dream.team14;

public class Calculator implements Calculators{
   private double fee = 49.95;
   private int basicTime = 1000;
   private double addLine = 14.50;
   private double addOverThree = 5.0;
   private double overTimeFee = 0.45;
   private int lineNumber;
   private int callTime;
   
   public Calculator(String plan, int line, int call){
      if("silver".equals(plan)){
         fee = 29.95;
         basicTime = 500;
         addLine = 21.50;
         addOverThree = 5.0;
         overTimeFee = 0.54;
      }
      this.lineNumber = line;
      this.callTime = call;
   }
   @Override
   public double totalCharge(){
      return lineCharge() + overtimeCharge();
   }
   
   @Override
   public double lineCharge(){
      int lineNum = lineNumber - 1;
      if(lineNum == 0)
         return fee;
      else if(lineNum < 4)
         return fee + addLine*lineNum;
      else
         return fee + addLine*2 + addOverThree*(lineNum-3);
   }
   
   @Override
   public double overtimeCharge(){
      int overtime = callTime-basicTime;
      if(overtime > 0)
         return overtime*overTimeFee;
      else
         return 0;
   }
}