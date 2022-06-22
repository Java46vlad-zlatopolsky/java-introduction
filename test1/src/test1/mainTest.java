package test1;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  long N = 9223372036854775807;
		  
	        System.out.println("Bytes in " + N + "  = " + log2(N));
	        

	}
	
	public static long log2(long N)
    {
 
        // calculate log2 N indirectly
        // using log() method
        long result = (long)(Math.log(N) / Math.log(2)+1);
        result /=8;
 
        return result;
    }
	

}


