package com.java.converters;

import com.java.exceptions.UnsupportedMathOperationException;

public class MathConverter {
	
	public static final String MESSAGE = "Operação inválida.";
	
	public static Double convert(String number) {
		if (number == null)
			throw new UnsupportedMathOperationException(MESSAGE);
		number.replaceAll(",", ".");
		if (isNumeric(number))
			return Double.parseDouble(number);
		
		throw new UnsupportedMathOperationException(MESSAGE);
	}
	
	public static boolean isNumeric(String number) {
		if (number == null)
			throw new UnsupportedMathOperationException(MESSAGE);
		number.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
