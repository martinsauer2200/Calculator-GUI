import java.util.ArrayList;

public class Function {

    public String outputString = "";
    public double currentNumber = 0;

    public String evaluate(ArrayList<String> expression) {
        int indexFirstMultiplication = 0, indexFirstDivision = 0;
        boolean multiplicationExists = false, divisionExists = false;

        if (expression.contains("*")) {
            indexFirstMultiplication = expression.indexOf("*");
            multiplicationExists = true;
        }

        if (expression.contains("/")) {
            indexFirstDivision = expression.indexOf("/");
            divisionExists = true;
        }

        if ((indexFirstMultiplication < indexFirstDivision && divisionExists && multiplicationExists) || (multiplicationExists && !divisionExists)) {
            int indexOfMultiplication = expression.indexOf("*");
            double newNumber = Double.parseDouble(expression.get(indexOfMultiplication-1)) * Double.parseDouble(expression.get(indexOfMultiplication+1));
            expression.remove(indexOfMultiplication);
            expression.remove(indexOfMultiplication);
            expression.set(indexOfMultiplication-1, Double.toString(newNumber));
            evaluate(expression);
        }

        if ((indexFirstDivision < indexFirstMultiplication && divisionExists && multiplicationExists) || (divisionExists && !multiplicationExists)) {
            int indexOfDivison = expression.indexOf("/");
            double newNumber = Double.parseDouble(expression.get(indexOfDivison-1)) / Double.parseDouble(expression.get(indexOfDivison+1));
            expression.remove(indexOfDivison);
            expression.remove(indexOfDivison);
            expression.set(indexOfDivison-1, Double.toString(newNumber));
            evaluate(expression);
        }

        if (expression.contains("+")) {
            int indexOfAddition = expression.indexOf("+");
            double newNumber = Double.parseDouble(expression.get(indexOfAddition-1)) + Double.parseDouble(expression.get(indexOfAddition+1));
            expression.remove(indexOfAddition);
            expression.remove(indexOfAddition);
            expression.set(indexOfAddition-1, Double.toString(newNumber));
            evaluate(expression);
        }

        if (expression.contains("-")) {
            int indexOfSubtraction = expression.indexOf("-");
            double newNumber = Double.parseDouble(expression.get(indexOfSubtraction-1)) - Double.parseDouble(expression.get(indexOfSubtraction+1));
            expression.remove(indexOfSubtraction);
            expression.remove(indexOfSubtraction);
            expression.set(indexOfSubtraction-1, Double.toString(newNumber));
            evaluate(expression);
        }

        return expression.get(0);
    }

}
