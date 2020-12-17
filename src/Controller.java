import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    Function func = new Function();
    ArrayList<String> expression = new ArrayList<String>();
    boolean isDecimal = false, equalFirstClick = true;
    int decimalCounter = 10;

    @FXML
    private TextField textField;

    @FXML
    void buttonAdditionAction(ActionEvent event) {
        func.outputString += " + ";
        textField.setText(func.outputString);
        expression.add(Double.toString(func.currentNumber));
        expression.add("+");
        func.currentNumber = 0;
        decimalCounter = 10;
        isDecimal = false;
    }

    @FXML
    void buttonDivisionAction(ActionEvent event) {
        func.outputString += " ÷ ";
        textField.setText(func.outputString);
        expression.add(Double.toString(func.currentNumber));
        expression.add("/");
        func.currentNumber = 0;
        decimalCounter = 10;
        isDecimal = false;
    }

    @FXML
    void buttonDotAction(ActionEvent event) {
        isDecimal = true;
        func.outputString += ".";
        textField.setText(func.outputString);
    }

    @FXML
    void buttonEightAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 8;
        }
        func.outputString += "8";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (8.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonEqualAction(ActionEvent event) {
        if (equalFirstClick) {
            expression.add(Double.toString(func.currentNumber));
            textField.setText(func.evaluate(expression));
            equalFirstClick = false;
        } else {
            isDecimal = false;
            equalFirstClick = true;
            textField.setText("");
            func.currentNumber = 0;
            expression.clear();
            func.outputString = "";
            decimalCounter = 10;
        }
    }

    @FXML
    void buttonFiveAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 5;
        }
        func.outputString += "5";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (5.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonFourAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 4;
        }
        func.outputString += "4";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (4.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonMultiplicationAction(ActionEvent event) {
        func.outputString += " x ";
        textField.setText(func.outputString);
        expression.add(Double.toString(func.currentNumber));
        expression.add("*");
        func.currentNumber = 0;
        decimalCounter = 10;
        isDecimal = false;
    }

    @FXML
    void buttonNineAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 9;
        }
        func.outputString += "9";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (9.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonOneAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 1;
        }
        func.outputString += "1";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (1.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonSevenAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 7;
        }
        func.outputString += "7";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (7.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonSixAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 6;
        }
        func.outputString += "6";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (6.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonSubtractionAction(ActionEvent event) {
        func.outputString += " - ";
        textField.setText(func.outputString);
        expression.add(Double.toString(func.currentNumber));
        expression.add("-");
        func.currentNumber = 0;
        decimalCounter = 10;
        isDecimal = false;
    }

    @FXML
    void buttonThreeAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 3;
        }
        func.outputString += "3";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (3.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonTwoAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10 + 2;
        }
        func.outputString += "2";
        textField.setText(func.outputString);
        if (isDecimal) {
            func.currentNumber += (2.0/decimalCounter);
            decimalCounter *= 10;
        }
    }

    @FXML
    void buttonZeroAction(ActionEvent event) {
        if (!isDecimal) {
            func.currentNumber = func.currentNumber*10;
        }
        func.outputString += "0";
        textField.setText(func.outputString);
        if (isDecimal) {
            decimalCounter *= 10;
        }
    }

}
