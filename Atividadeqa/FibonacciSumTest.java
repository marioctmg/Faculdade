import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciSumTest {

    @Test
    public void testSumFibonacci() {
        // Teste para n = 1
        assertEquals(0, FibonacciSum.sumFibonacci(1));

        // Teste para n = 2
        assertEquals(1, FibonacciSum.sumFibonacci(2));

        // Teste para n = 3
        assertEquals(2, FibonacciSum.sumFibonacci(3));

        // Teste para n = 4
        assertEquals(4, FibonacciSum.sumFibonacci(4));

        // Teste para n = 5
        assertEquals(7, FibonacciSum.sumFibonacci(5));

        // Teste para n = 10
        assertEquals(143, FibonacciSum.sumFibonacci(10));

        // Teste para n = 0 (caso especial)
        assertEquals(0, FibonacciSum.sumFibonacci(0));
    }
}
