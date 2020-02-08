package calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

enum OperatorType {
    PLUS((operand1, operand2) -> operand1 + operand2, "+"),
    MINUS((operand1, operand2) -> operand1 - operand2, "-"),
    MULTIPLY((operand1, operand2) -> operand1 * operand2, "*"),
    DIVIDE((operand1, operand2) -> operand1 / operand2, "/");

    private BiFunction<Double, Double, Double> expression;
    private String operator;

    OperatorType(BiFunction<Double, Double, Double> expression, String operator) {
        this.expression = expression;
        this.operator = operator;
    }

    public static OperatorType validateOperator(String input) {
        return Arrays.stream(OperatorType.values())
                .filter(c -> c.operator.equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(input + " is not valid operator"));
    }

    public double calculate(Operand operand1, Operand operand2) {
        return expression.apply(operand1.getOperand(), operand2.getOperand());
    }
}
