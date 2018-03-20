import static org.junit.Assert.*;

public class CalcTest {

    @org.junit.Test
    public void add() {
        int res = Calc.add(5,5);
        assertEquals(10, res);
    }

    @org.junit.Test
    public void sub() {
        int res = Calc.sub(5,5);
        assertEquals(0, res);
    }

    @org.junit.Test
    public void mul() {
        int res = Calc.mul(5,5);
        assertEquals(25, res);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void div() {
        int res = Calc.div(5,0);
    }
}