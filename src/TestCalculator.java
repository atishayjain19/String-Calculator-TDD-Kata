import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculator {
	public void EmptyStringReturnZero() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.calculate(""),0);
	}
	
	
}