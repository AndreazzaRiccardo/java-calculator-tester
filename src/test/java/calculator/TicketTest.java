package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    int age;
    int kilometers;
    Random rnd = new Random();

    @BeforeEach
    void initValues(){
        age = rnd.nextInt((100 - -10) + 1) + -10;
        kilometers = rnd.nextInt((500 - -10) + 1) + -10;
    }

    @RepeatedTest(30)
    public void testTicketCalculate(){
//        System.out.println("Age: " + age + "  " + "Km: " + kilometers);

        if(age < 0 || kilometers < 0){
            assertThrows(IllegalArgumentException.class, ()-> new Ticket(age, kilometers));
        } else if(age < 18) {
            Ticket ticket = new Ticket(age, kilometers);
            double expectedPrice = kilometers * 0.21 * 0.80;
            assertEquals(expectedPrice, ticket.calculateTicket(), 0.01);
        } else if (age > 65) {
            Ticket ticket = new Ticket(age, kilometers);
            double expectedPrice = kilometers * 0.21 * 0.60;
            assertEquals(expectedPrice, ticket.calculateTicket(), 0.01);
        } else {
            Ticket ticket = new Ticket(30, 100);
            double expectedPrice = 100 * 0.21;
            assertEquals(expectedPrice, ticket.calculateTicket(), 0.01);
        }
    }
}