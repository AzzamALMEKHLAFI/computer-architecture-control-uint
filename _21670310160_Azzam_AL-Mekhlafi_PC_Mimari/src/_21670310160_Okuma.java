import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _21670310160_Okuma {
	 static boolean isOpCodeInRange(String opCode) {
        return opCode.compareTo("000") >= 0 && opCode.compareTo("110") <= 0;
    }
	  static String findFirstOneIndex(int[] binaryArray) {
	        for (int i = 0; i < binaryArray.length; i++) {
	            if (binaryArray[i] == 1) {
	            	if(binaryArray.length==16) {
	            		String zaman="T"+i;
		                return zaman;
	            	} else if(binaryArray.length==8) {
	            		String zaman ="D"+i;
	            		return zaman;
	            	}
	            	
	            }
	        }
	        return "Zaman da yanlis var"; 
	    }
	
	public  void dosya_oku() {
		String file = "RAM.txt";
		_21670310160_decoder3_8 get =new _21670310160_decoder3_8 ();
		_21670310160_SC get2 =new _21670310160_SC ();
		_21670310160_decoder4_16 get1=new _21670310160_decoder4_16();
		_21670310160_Buyruk get_buyruk =new _21670310160_Buyruk();
		get_buyruk.Buyruk_tablosu_eklme();

        int k=0;

		 
		  File inputFile = new File(file);
		 
	  try {
          Scanner scanner = new Scanner(inputFile);
          
      	while ( scanner.hasNextLine()) {
      	  String line= scanner.nextLine();
      	 String[] values = line.split("");
         int[] ir_register = new int[values.length];
    
         for (int i = 0; i < values.length; i++) {
             ir_register[i] = Integer.parseInt(values[i]);

         }
         
          System.out.println();
          int bitCount = 4;          
          String binary = _21670310160_SC.toBinary(k, bitCount);

         k++;

          int index1=binary.charAt(0)- '0';

          int index2=binary.charAt(1)- '0';

          int index3=binary.charAt(2)- '0';

          int index4=binary.charAt(3)- '0';


         
          int[] opc_kod = _21670310160_decoder3_8.decode3x8(ir_register[1], ir_register[2], ir_register[3]);

          int [] zaman_sinyallari= _21670310160_decoder4_16.decode4x16(index1, index2, index3, index4);

          int I = ir_register[0];
          System.out.print(findFirstOneIndex(zaman_sinyallari)+" zamaninda "+"I="+I+" ");
          System.out.print(findFirstOneIndex(opc_kod));

          System.out.print("aktif IR(11-0)");

          for (int j = 4; j < ir_register.length; j++) {
        	  System.out.print(ir_register[j]);        			
		}
          System.out.print(" ");
          
          if (line.startsWith("0111") || line.startsWith("1111")) {
        	  System.out.println("buyruk="+get_buyruk.Buyruk_yazacin_getir(line)+" "); 


          }else if(line.startsWith("0") && isOpCodeInRange(line.substring(1, 4))) {

        	    System.out.println("buyruk="+get_buyruk.Buyruk_Bellek_dogru_getir(line)+" ");

        
               }else {
        		     System.out.println("buyruk="+get_buyruk.Buyruk_Bellek_Dolayli_getir(line)+" ");
               }	
          

          
        /*  for (int b : opc_kod) {
        	  	System.out.print(b);			
		}
			System.out.print(" ");

          for (int b : zaman_sinyallari) {
			System.out.print(b);
		}
			System.out.print(" ");

          for (int j = 0; j < ir_register.length; j++) {

        	  System.out.print(ir_register[j]);
		}
          System.out.println();*/
           		 
      		 
      	}
	
}  catch (FileNotFoundException e) {
    System.out.println("File not found!");
    e.printStackTrace();
}
      	
	  } 
	  
	}
