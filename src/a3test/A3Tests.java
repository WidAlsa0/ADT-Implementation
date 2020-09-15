package a3test;

import a3.ComplexNumberImpl;
import a3.ComplexNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class A3Tests {

    // Test axiom:
    // real(create(A,B)) = ????
    @Test
    public void testReal() {
        ComplexNumber test1 = new ComplexNumberImpl(2, 3);
        ComplexNumber test2 = new ComplexNumberImpl(0, 8);
        assertEquals(2, test1.getReal());
        assertEquals(0, test2.getReal());

    }

    // Test axiom:
    // imag(create(A,B)) = ????
    @Test
    public void testImag() {
        ComplexNumber test1 = new ComplexNumberImpl(3, 4);
        assertEquals(4, test1.getImaginary());
    }

    // Test axiom:
    // absolute(create(A,B)) = ????
    @Test
    public void testAbsolute() {
        ComplexNumber test1 = new ComplexNumberImpl(3, 4);
        assertEquals(5, test1.getAbsValue());

    }

    // Test axiom:
    // add(create(A,B), C) = ????
    @Test
    public void testAdd1() {
        double a = 2;
        double b = 2;
        ComplexNumber number = new ComplexNumberImpl(2,3);
        ComplexNumber number2 = new ComplexNumberImpl(a,b);
        ComplexNumber test1 = number2.add(number);
        ComplexNumber expected = new ComplexNumberImpl(a + number.getReal() , b + number.getImaginary());
        System.out.println(test1.getReal() + "");
        System.out.println(test1.getImaginary() + "");
        assertEquals(expected, test1);

    }

    // Test axiom:
    // add(C, create(A,B)) = ????
    @Test
    public void testAdd2() {
        

    }

    // Test axiom:
    // multiply(create(A,B), C) = ????
    @Test
    public void testMultiply1() {
        fail("Replace with testing code");
    }

    // Test axiom:
    // multiply(C, create(A,B)) = ????
    @Test
    public void testMultiply2() {
        fail("Replace with testing code");
    }

    // Test axiom:
    // equals(create(A,B), C) = ????
    @Test
    public void testEquals1() {
        double a = 2;
        double b = 2;
        ComplexNumber number1 = new ComplexNumberImpl(2, 2);
        boolean test1 = new ComplexNumberImpl(a,b).equals(number1);

        assertEquals(true, test1);

    }

    // Test axiom:
    // equals(C, create(A,B)) = ????
    @Test
    public void testEquals2() {
        double a = 2;
        double b = 5;
        ComplexNumber number = new ComplexNumberImpl(2,2);
        boolean test1 = number.equals(new ComplexNumberImpl(a,b));

        assertEquals(false, test1);

    }
}
