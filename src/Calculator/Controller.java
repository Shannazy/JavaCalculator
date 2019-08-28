package Calculator;
import  java.math.RoundingMode;
import java.text.DecimalFormat;

public class Controller {
    public double Addition(double num1, double num2) {
        return num1 + num2;
    }

    public double Subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double Division(double num1, double num2) {
        try {
            DecimalFormat twoPlaces = new DecimalFormat("#.00");
            return Double.valueOf(twoPlaces.format(num1/num2));
        } catch (ArithmeticException|NumberFormatException e) {
            return 0;
        }
    }

    public double Multiply(double num1, double num2) {
        DecimalFormat twoPlaces = new DecimalFormat("#.00");
        return Double.valueOf(twoPlaces.format(num1*num2));

    }

}