import java.util.HashMap;

public class _21670310160_Buyruk {
    HashMap<String, String> Yazac_Adersleme = new HashMap<>();
    HashMap<String, String> Bellek_Dogru_Adersleme = new HashMap<>();
    HashMap<String, String> Bellek_Dolayli_Adersleme = new HashMap<>();

    
	  void Buyruk_tablosu_eklme() {

        Yazac_Adersleme.put("CLA", "7800");
        Yazac_Adersleme.put("CLE", "7400");
        Yazac_Adersleme.put("CMA", "7200");
        Yazac_Adersleme.put("CME", "7100");
        Yazac_Adersleme.put("CIR", "7080");
        Yazac_Adersleme.put("CIL", "7040");
        Yazac_Adersleme.put("INC", "7020");
        Yazac_Adersleme.put("SPA", "7010");
        Yazac_Adersleme.put("SNA", "7008");
        Yazac_Adersleme.put("SZA", "7004");
        Yazac_Adersleme.put("SZE", "7002");
        Yazac_Adersleme.put("HLT", "7001");
        Yazac_Adersleme.put("INP", "F800");
        Yazac_Adersleme.put("OUT", "F400");
        Yazac_Adersleme.put("SKI", "F200");
        Yazac_Adersleme.put("SKO", "F100");
        Yazac_Adersleme.put("ION", "F080");
        Yazac_Adersleme.put("IOF", "F040");
        
        Bellek_Dogru_Adersleme.put("AND", "0xxx");
        Bellek_Dogru_Adersleme.put("ADD", "1xxx");
        Bellek_Dogru_Adersleme.put("LDA", "2xxx");
        Bellek_Dogru_Adersleme.put("STA", "3xxx");
        Bellek_Dogru_Adersleme.put("BUN", "4xxx");
        Bellek_Dogru_Adersleme.put("BSA", "5xxx");
        Bellek_Dogru_Adersleme.put("ISZ", "6xxx");
        
        Bellek_Dolayli_Adersleme.put("AND", "8xxx");
        Bellek_Dolayli_Adersleme.put("ADD", "9xxx");
        Bellek_Dolayli_Adersleme.put("LDA", "Axxx");
        Bellek_Dolayli_Adersleme.put("STA", "Bxxx");
        Bellek_Dolayli_Adersleme.put("BUN", "Cxxx");
        Bellek_Dolayli_Adersleme.put("BSA", "Dxxx");
        Bellek_Dolayli_Adersleme.put("ISZ", "Exxx");

        
    }
	
	  String Buyruk_yazacin_getir( String value) {
        for (HashMap.Entry<String, String> entry : Yazac_Adersleme.entrySet()) {
            if (hexToBinary(entry.getValue()).equals(value)) {
                return entry.getKey();
            }
        }
        return null; 
    }
	  String Buyruk_Bellek_Dolayli_getir( String value) {
        for (HashMap.Entry<String, String> entry : Bellek_Dolayli_Adersleme.entrySet()) {
            if (value.startsWith(hexdigitToBinary(entry.getValue()))) {
                return entry.getKey();
            }
        }
        return null; // Return null if no matching key is found
    }
	  String Buyruk_Bellek_dogru_getir( String value) {
        for (HashMap.Entry<String, String> entry : Bellek_Dogru_Adersleme.entrySet()) {
            if (value.startsWith(hexdigitToBinary(entry.getValue()))) {
                return entry.getKey();
            }
        }
        return null; 
    }
	  
	  
	  
	    String hexToBinary(String hexValue) {
	    	  int intValue = Integer.parseInt(hexValue, 16);
	    	    String binaryValue = Integer.toBinaryString(intValue);

	    	    // Ensure that the binary value has leading zeros to make it 16 bits
	    	    int leadingZerosCount = 16 - binaryValue.length();
	    	    StringBuilder leadingZeros = new StringBuilder();
	    	    
	    	    for (int i = 0; i < leadingZerosCount; i++) {
	    	        leadingZeros.append("0");
	    	    }

	    	    return leadingZeros.toString() + binaryValue;
	    }
	    
	    
	    String hexdigitToBinary(String hexValue) {
	    	
	    	switch (hexValue) {
            case "0xxx":
                return "0000";
            case "1xxx":
                return "0001";
            case "2xxx":
                return "0010";
            case "3xxx":
                return "0011";
            case "4xxx":
                return "0100";
            case "5xxx":
                return "0101";
            case "6xxx":
                return "0110";
            case "8xxx":
                return "1000";
            case "9xxx":
                return "1001";
            case "Axxx":
                return "1010";
            case "Bxxx":
                return "1011";
            case "Cxxx":
                return "1100";
            case "Dxxx":
                return "1101";
            case "Exxx":
                return "1110";
            default:
                return "Bu degeri bulunmamaktadir";
        }
	    	
	    }

	    
	


}
