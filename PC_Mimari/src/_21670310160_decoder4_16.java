
public class _21670310160_decoder4_16 {
     static int[] decode4x16(int a, int b, int c, int d) {
		  int[] output = new int[16];

		  for (int i = 0; i < 16; i++) {
	            int aBit = (i & 8) >> 3;
	            int bBit = (i & 4) >> 2;
	            int cBit = (i & 2) >> 1;
	            int dBit = i & 1;

	            output[i] = (a == aBit && b == bBit && c == cBit && d == dBit) ? 1 : 0;
	        }

	        return output;
	    }
}
