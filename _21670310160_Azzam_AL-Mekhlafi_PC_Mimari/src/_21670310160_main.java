
public class _21670310160_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_21670310160_Okuma get =new _21670310160_Okuma ();
		 
		
		get.dosya_oku();
		
		
		


            }


        
        

      
        
           
			

            

        

	
	
	
	
	
	
	
	
	 private static int[] convertStringArrayToIntArray(String[] stringArray) {
	        int length = stringArray.length;
	        int[] intArray = new int[length];

	        for (int i = 0; i < length; i++) {
	            try {
	                intArray[i] = Integer.parseInt(stringArray[i]);
	            } catch (NumberFormatException e) {
	                System.err.println("olmadi");
	            }
	        }

	        return intArray;
	    }

}
