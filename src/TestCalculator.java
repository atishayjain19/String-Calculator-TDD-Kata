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
	public void EmptyStringReturnZero() throws Exception{
		assertEquals(calculator.Add(""), 0);
	}
	
	public void SingleValueIsReplied() throws Exception{
	    assertEquals(calculator.Add("1"), 1);
	}
	
	public void TwoNumbersCommaDelReturnSum() throws Exception
	{
	    assertEquals(calculator.Add("1,2"), 3);
	}	
	
	public void UnknownNumbersDelimeterSum() throws Exception
    {
        assertEquals(calculator.Add("1,2,3"),6);
    }
	
	//new line in input.
	public void newline() throws Exception
	{
		 assertEquals(calculator.Add("1\n2,3"),6);
		 
	}
	
	public void SupportDiffDelimitersSum() throws Exception
	{
		assertEquals(calculator.Add("//;\n1;2;3"), 6);
	}
	
	// negative input through exception;
    @Test(expectedExceptions= Exception.class)
    public void negativeInputReturnsException() throws Exception{
        calculator.Add("-1");
    }
	
}