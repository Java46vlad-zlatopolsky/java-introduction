package toBinaryStr_methods;

public class Methods {

	 public static String toBinaryStr(int number) {
		
	 String binary = "", reverse = "0";
	 int res = 0;
		 if (number > 0 ) {
		 for (int i = 0; number > 0 ; i++) {
			 res = number % 2;
			 binary += res;
			 number /= 2;
			// System.out.print(binary + " " );
		 }
		 
		 reverse = new StringBuffer(binary).reverse().toString(); // reverting binary to return correct order of binary view
		 }
		 
		 return reverse;
		 
	
		 
		 
	 }
	
}
