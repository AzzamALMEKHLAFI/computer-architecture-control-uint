import java.util.Scanner;

public class _21670310160_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);  

				
		_21670310160_Okuma get =new _21670310160_Okuma ();
	//	get1.Buyruk_tablosu_eklme();
		get.dosya_oku();

	//String op=get1.Buyruk_yazacin_getir("1111001000000000");
	//System.out.println(get1.Buyruk_Bellek_dogru_getir("0001111111111111"));
		 
      // String la=get1.hexToBinary("2231");
		//System.out.println(op);
		
		
		


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
