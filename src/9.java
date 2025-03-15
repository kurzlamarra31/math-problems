  package com.math;

  public class MathProblem {
  
    private int number1;
    private int number2;
    private int answer;
    private String problemType;
  
    public MathProblem() {
      this.number1 = (int) (Math.random() * 100);
      this.number2 = (int) (Math.random() * 100);
      this.answer = number1 + number2;
      this.problemType = "addition";
    }
  
    public int getNumber1() {
      return this.number1;
    }
  
    public int getNumber2() {
      return this.number2;
    }
  
    public int getAnswer() {
      return this.answer;
    }
  
    public String getProblemType() {
      return this.problemType;
    }
  }