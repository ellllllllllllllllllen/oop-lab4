package by.bntu.fitr.povt.zavadskaya.labs.lab4.controler;

import by.bntu.fitr.povt.zavadskaya.labs.lab4.logic.Age;
import by.bntu.fitr.povt.zavadskaya.labs.lab4.view.Input;
import by.bntu.fitr.povt.zavadskaya.labs.lab4.view.Message;
import by.bntu.fitr.povt.zavadskaya.labs.lab4.view.Output;

public class Main {

	public static void main(String[] args) {
		Output.output(Age.ageCalculation(Input.input("Input birth day: "), Input.input("Input birth month: "),
				Input.input("Input birth year: ")));
		Message.output();
	}
}
