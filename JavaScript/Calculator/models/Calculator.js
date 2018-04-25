function Calculator(leftOperand, operator, rightOperand) {
    this.leftOperand = Number(leftOperand);
    this.operator = operator;
    this.rightOperand = Number(rightOperand);

    this.calculateResult = function () {
        let result = 0;

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
                result = Math.pow(this.leftOperand, (1 / this.rightOperand));
                break;
        }

        return result; // this is for the inside function calculateResult
    }

    this.createOperation = function() {
        if (this.operator === "root"){
            return `${this.leftOperand} \u221A ${this.rightOperand} = ${this.calculateResult()}`;
        } else {
            return `${this.leftOperand} ${this.operator} ${this.rightOperand} = ${this.calculateResult()}`;
        }
    }
    // console.log(this.createOperation()); // tuk rezultatut izliza sus znakut za koren, no v stranicata na kalkulatora ne iska
}

// Calculator(25, "root", 2);

module.exports = Calculator;