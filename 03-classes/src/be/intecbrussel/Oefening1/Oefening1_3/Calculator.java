package be.intecbrussel.Oefening1.Oefening1_3;


public class Calculator {
    double result;

    public double addition(double num1, double num2) {
        result = num1 + num2;
        return result;
    }

    public double substraction(double num1, double num2) {
        result = num1 - num2;
        return result;
    }

    public double multiplication(double num1, double num2) {
        result = num1 * num2;
        return result;
    }

    public double division(double num1, double num2) {
        result = num1 / num2;
        return result;
    }

    public double modulus(double num1, double num2) {
        result = num1 % num2;
        return result;
    }
}