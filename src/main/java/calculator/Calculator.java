package calculator;

public class Calculator {

    public static float add(float n1, float n2){
        return n1 + n2;
    }

    public static float subtract(float n1, float n2){
        return n1 - n2;
    }

    public static float divide(float n1, float n2){
        if(n2 == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return n1 / n2;
    }

    public static float multiply(float n1, float n2){
        return n1 * n2;
    }
}
