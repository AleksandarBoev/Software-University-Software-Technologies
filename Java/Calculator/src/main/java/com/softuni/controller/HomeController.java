package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class HomeController {
	@GetMapping("/") // "/" means where to "listen"
	public String index(Model model) {
		model.addAttribute("operator", "+");
		model.addAttribute("view", "views/calculatorForm"); // tuk se izprashta neshto drugo, zashtoto promenlivata "view" e po-specialna
		//i tq chaka nqkakuv template, koito da zaredi. VINAGI se izprashtat dannite kato String-ove. Neshto kato judge. Vinagi v zadachite se pishe
		//scanner.nextLine() za da se priemat dannite, zashtoto judge ni gi prashta pod formata na string-ove, no e rabota na aplikaciqta
		//tezi stringovi danni da gi preobrazuva v drug tip danni, za da se izpolzvat korektno. V tozi sluchai preobrazuvaneto v drug tip danni stava
		// chrez razlichnite tipove "th:" ? Ne sum mn siguren za tazi posledna chast.
		return "base-layout";
	}

	@PostMapping("/")
	public String calculate(@RequestParam String leftOperand,
							@RequestParam String operator,
							@RequestParam String rightOperand,
							Model model){
		leftOperand = leftOperand.replace(',', '.'); // ne znam kak da opravq nastroikite da ne mi zamenq "." s ","
		rightOperand = rightOperand.replace(',', '.'); // no tova raboti zasega
		double num1;
		double num2;

		try {
			num1 = Double.parseDouble(leftOperand);
		} catch (NumberFormatException ex) {
			num1 = 0.0;
		}

		try {
			num2 = Double.parseDouble(rightOperand);
		} catch (NumberFormatException ex) {
			num2 = 0.0;
		}

		Calculator calculator = new Calculator(num1, num2, operator);
		double result = calculator.calculateResult();

		DecimalFormat df = new DecimalFormat("#.##############");

		model.addAttribute("leftOperand", df.format(calculator.getLeftOperand()));
		model.addAttribute("rightOperand", df.format(calculator.getRightOperand()));
		model.addAttribute("operator", calculator.getOperator());
		model.addAttribute("result", df.format(result));

		String lastOperation = String.format("%s %s %s = %s", df.format(num1), calculator.getOperator(), df.format(num2), df.format(result));
		model.addAttribute("lastOperation", lastOperation);

		model.addAttribute("view", "views/calculatorForm");
		return "base-layout";
	}

}
