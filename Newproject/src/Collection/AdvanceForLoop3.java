package Collection;

public class AdvanceForLoop3 

{
    public static void main(String[] args) 
    
    {
	    int[] Number = {22,33,44,55,66,77};
	    int addition = 0;
	    
	    for(int Numb : Number) 
	    
	    {
	    	addition += Numb;
	    }
	    
	    System.out.println("Addition = " +addition);
    }
}
