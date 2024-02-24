
public class _21670310160_SC {
	 static String toBinary(int decimal, int bitCount) {
		 StringBuilder binary = new StringBuilder();

	        for (int i = bitCount - 1; i >= 0; i--) {
	            int bit = (decimal & (1 << i)) == 0 ? 0 : 1;
	            binary.append(bit);
	        }

	        return binary.toString();
	    }
}


