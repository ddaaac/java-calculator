package exceptions;

public class InvalidOperatorException extends IllegalArgumentException {
	private final String invalidOperator;

	public InvalidOperatorException(String invalidOperator) {
		super(String.format("'%s' is not valid operator\nOnly +, -, *, / is permitted", invalidOperator));
		this.invalidOperator = invalidOperator;
	}
}
