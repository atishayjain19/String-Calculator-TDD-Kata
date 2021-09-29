import java.util.ArrayList;
import java.util.List;

public class Calculator {
	//allow to add new line between numbers
	public String delimeter = ",|\n";
    public int Add(String input) throws Exception{
    	String input1=input;
    	if (input1.substring(0, 2).equals("//"))
        {
    		delimeter=delimeter+"|"+findDelimeter(input1);
        }
    	String[] numbers = input.split(delimeter);

    	if(isEmpty(input)){
            return 0;
        }
    	else if(input.length()==1){
            return stringToint(input);
        }
      	else{
            return getsum(numbers);
        }
    }
    //This function to find differnt Delimeter
    private String findDelimeter(String input1)
    {
  		int i=2;
		while(input1.charAt(i)!='\n')
		{
			i++;
		}
		return (input1.substring(2, i+1));
		
    }
    
    
    private boolean isEmpty(String input){
        return input.isEmpty();
    }
    
    private int stringToint(String input){
        return Integer.parseInt(input);
    }
    // Allow the Add method to handle an unknown amount of numbers
    private int getsum(String[] numbers) throws Exception
    {
    	//this loop check if negative integers there in array.
    	for(String num:numbers){
    		 List<Integer> negative = new ArrayList<Integer>();
    		 if(stringToint(num)<0){
                 negative.add(stringToint(num));
             }
            if(stringToint(num)<0){
            	
            	//prints negative values.
            	for (int val:negative)
            	{
            		System.out.print(val);
            	} 
                throw new Exception("negatives not allowed");
            }
        }
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=Integer.parseInt(numbers[i]);
        }
        return sum;
    }
    
 
    
}
