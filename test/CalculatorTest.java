import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
 private Calculator calc;
 @BeforeEach
 void setUp() {
 calc = new Calculator();
 }
 @Test
 @DisplayName("1. add(2, 3) = 5")
 void testAdd() {
 assertEquals(5, calc.add(2, 3));
 }
 @Test
 @DisplayName("2. subtract(10, 4) = 6")
 void testSubtract() {
 assertEquals(6, calc.subtract(10, 4), "Subtraction is wrong");
 }
 @Test
 @DisplayName("3. multiply(4, 5) = 20")
 void testMultiply() {
 assertEquals(20, calc.multiply(4, 5));
 }
 @Test
 @DisplayName("4. divide(10, 4) = 2.5")
 void testDivide() {
 assertEquals(2.5, calc.divide(10, 4), 0.001);
 }
 @Test
 @DisplayName("5. divide by zero throws exception")
 void testDivideByZero() {
 Exception ex = assertThrows(ArithmeticException.class,
 () -> calc.divide(10, 0));
 assertEquals("Cannot divide by zero", ex.getMessage());
 }
}