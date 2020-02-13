package exceptions;

public class NotOddLengthInputsException extends IllegalArgumentException {
	private final int length;

	public NotOddLengthInputsException(int length) {
		super(String.format("%d(length of inputs) is not odd", length));
		this.length = length;
	}
}
