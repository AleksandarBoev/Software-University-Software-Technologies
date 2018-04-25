const Calculator = require('../models/Calculator');

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => { //lambda funkciq
        let calculatorBody = req.body; //moje i calculatorParams = req.body['calculator'] i da se spestqt redove

        let calculatorParams = calculatorBody['calculator'];
        let calculator = new Calculator();
        calculator.leftOperand = Number(calculatorParams.leftOperand); //daje ako sum napravil v "index.hbs" za leftOperand input type="number"
        // kastvaneto e pak zaduljitelno. Strannoto e che operaciqta koren si se izpulnqva kakto trqbva, no sumiraneto stava kato string concat
        calculator.operator = calculatorParams.operator;
        calculator.rightOperand = Number(calculatorParams.rightOperand);

        let result = calculator.calculateResult();

        let lastOperation = calculator.createOperation();

        res.render('home/index', {'calculator': calculator, 'result': result, 'lastOperation':lastOperation});
    }
};