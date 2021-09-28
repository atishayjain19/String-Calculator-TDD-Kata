import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Test
public class TestCalculator {
    private Calculator calculator;
    
    @BeforeTest
    public void init(){
        calculator = new Calculator();
    }
	public void EmptyStringReturnZero() {
		assertEquals(calculator.Add(""), 0);
	}
	
	public void SingleValueIsReplied(){
	    assertEquals(calculator.Add("1"), 1);
	}
	
	public void TwoNumbersCommaDelReturnSum()
	{
	    assertEquals(calculator.Add("1,2"), 3);
	}	
	
	public void UnknownNumbersDelimeterSum()
    {
        assertEquals(calculator.Add("1,2,3"),6);
    }
}