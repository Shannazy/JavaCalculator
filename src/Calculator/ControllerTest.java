package Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void addition() {
        Controller testing = new Controller();
        assertEquals(5, testing.Addition(2, 3));
        assertEquals(8, testing.Addition(5, 3));
    }

    @Test
    void subtract() {
        Controller testing = new Controller();
        assertEquals(8, testing.Subtract(10, 2));
        assertEquals(-2, testing.Subtract(0, 2));
    }

    @Test
    void division() {
        Controller testing = new Controller();
        assertEquals(2, testing.Division(6, 3));
        assertEquals(2.33, testing.Division(7, 3));
        assertEquals(0.5, testing.Division(1, 2));
        assertEquals(0, testing.Division(5, 0));
    }

    @Test
    void multiply() {
        Controller testing = new Controller();
        assertEquals(6, testing.Multiply(2, 3));
        assertEquals(4.5, testing.Multiply(1.5, 3));
        assertEquals(7.70, testing.Multiply(2.568, 3));

    }
}