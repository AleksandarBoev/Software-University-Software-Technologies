package com.softuni.entity;

public class Calculator { // nqma nujda ot pisane na nqkakvu putishta ili kakvoto i da bilo. Tova si e logikata, koqto shte se polzva ot controller-a
    private double leftOperand;
    private double rightOperand;
    private String operator;

    public double getLeftOperand() {
        return this.leftOperand;
    }

    public double getRightOperand() {
        return this.rightOperand;
    }

    public String getOperator() {
        return this.operator;
    }

    public Calculator(double leftOperand, double rightOperand, String operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double calculateResult() {
        double result = 0.0;

        switch (this.operator) {
            case "+":
                result = this.leftOperand + this.rightOperand;
                break;

            case "-":
                result = this.leftOperand - this.rightOperand;
                break;

            case "*":
                result = this.leftOperand * this.rightOperand;
                break;

            case "/":
                result = this.leftOperand / this.rightOperand;
                break;

            case "^":
                result = Math.pow(this.leftOperand, this.rightOperand);
                break;

            case "root":
                result = Math.pow(this.leftOperand, 1.0 / this.rightOperand);
                break;
        }

        return result;
    }
}
