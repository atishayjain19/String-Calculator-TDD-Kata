
public class Calculator {
	//allow to add new line between numbers
	private final String delimeter = ",|\n";
    public int Add(String input){
    
  
    String[] numbers = input.split(delimeter);   
        if(isEmpty(input)){
            return 0;
        }
        if(input.length()==1){
            return stringToint(input);
        }
        
        else{
            return getsum(numbers);
        }
    }
    private boolean isEmpty(String input){
        return input.isEmpty();
    }
    
    private int stringToint(String input){
        return Integer.parseInt(input);
    }
    // Allow the Add method to handle an unknown amount of numbers
    private int getsum(String[] numbers)
    {
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=Integer.parseInt(numbers[i]);
        }
        return sum;
    }
}
