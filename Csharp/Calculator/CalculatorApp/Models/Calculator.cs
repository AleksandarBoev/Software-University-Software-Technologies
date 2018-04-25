﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CalculatorApp.Models
{
    public class Calculator
    {
        public Calculator()
        {
            this.Result = 0.0;
        }

        public double LeftOperand { get; set; }
        public string Operator { get; set; }
        public double RightOperand { get; set; }
        public double Result { get; set; }
        public string LastOperation { get; set; }

        public void CalculateResult()
        {
            switch (this.Operator)
            {
                case "+":
                    this.Result = this.LeftOperand + this.RightOperand;
                    break;
                case "-":
                    this.Result = this.LeftOperand - this.RightOperand;
                    break;
                case "*":
                    this.Result = this.LeftOperand * this.RightOperand;
                    break;
                case "/":
                    this.Result = this.LeftOperand / this.RightOperand;
                    break;
                case "^":
                    this.Result = Math.Pow(this.LeftOperand, this.RightOperand);
                    break;
                case "√":
                    this.Result = Math.Pow(this.LeftOperand, 1.0/this.RightOperand);
                    break;
            }
        }
        public void BuildLastOperation()
        {
            this.LastOperation = $"{this.LeftOperand} {this.Operator} {this.RightOperand} = {this.Result}";
        }


    }
}
