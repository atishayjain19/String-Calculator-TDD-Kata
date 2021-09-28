
public class Calculator {
    public int Add(String input){   
    	String[] numbers = input.split(",");   
        if(isEmpty(input)){
            return 0;
        }
        if(input.length()==1){
            return stringToint(input);
        }
        
        else{
            return Integer.parseInt(numbers[0])+ Integer.parseInt(numbers[1]);
        }
    } 
        
    private int stringToint(String input){
        return Integer.parseInt(input);
    }
    
    private boolean isEmpty(String input){
        return input.isEmpty();
    }
	
}
