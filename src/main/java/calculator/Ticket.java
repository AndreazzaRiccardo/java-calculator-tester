package calculator;

public class Ticket {

    private final int age;
    private final int kilometers;

    public Ticket(int age, int kilometers) {
        this.age = isPositive(age);
        this.kilometers = isPositive(kilometers);
    }

    public double calculateTicket(){
        double totalPrice = kilometers * 0.21;
        double finalPrice;
        if(age < 18) {
            finalPrice = totalPrice - ( totalPrice * 20 / 100);
        } else if ( age > 65) {
            finalPrice = totalPrice - ( totalPrice * 40 / 100 );
        } else {
            finalPrice = totalPrice;
        }
        return finalPrice;
    }

    private int isPositive(int n) throws IllegalArgumentException{
        if(n < 0){
            throw new IllegalArgumentException("Value must be positive");
        }
        return n;
    }
}
