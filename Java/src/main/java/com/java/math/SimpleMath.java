package com.java.math;

import com.java.converters.MathConverter;

public class SimpleMath {

	public Double sum(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);

		return numberOneConverted + numberTwoConverted;
	}

	public Double sub(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);

		return numberOneConverted - numberTwoConverted;
	}

	public Double mul(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);

		return numberOneConverted * numberTwoConverted;
	}

	public Double div(String numberOne, String numberTwo) {
		var numberOneConverted = MathConverter.convert(numberOne);
		var numberTwoConverted = MathConverter.convert(numberTwo);

		return numberOneConverted / numberTwoConverted;
	}

	public Double med(String numberOne, String numberTwo) {

		return this.sum(numberOne, numberTwo) / 2;
	}

}