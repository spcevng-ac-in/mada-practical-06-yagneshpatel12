package com.techninja01.practical06;

public class Calculator {
    public enum Operator{ADD,SUB,MUL,DIV}
    public double add(double firstOperand,double secondOperand){
        return firstOperand+secondOperand;
    }
    public double sub(double firstOperand,double secondOperand){
        return firstOperand-secondOperand;
    }
    public double mul(double firstOperand,double secondOperand){
        return firstOperand*secondOperand;
    }
    public double div(double firstOperand,double secondOperand){
        return firstOperand/secondOperand;
    }
}
