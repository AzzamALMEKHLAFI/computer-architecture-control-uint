
public class _21670310160_decoder3_8 {
	 static int[] decode3x8(int i, int j, int k) {

		 int[] output = new int[8];

	        output[1] =  ((i == 0 && j == 0 && k == 1) ? 1 : 0);
	        output[0] =  ((i == 0 && j == 0 && k == 0) ? 1 : 0);
	        output[2] =  ((i == 0 && j == 1 && k == 0) ? 1 : 0);
	        output[3] =  ((i == 0 && j == 1 && k == 1) ? 1 : 0);
	        output[4] =  ((i == 1 && j == 0 && k == 0) ? 1 : 0);
	        output[5] =  ((i == 1 && j == 0 && k == 1) ? 1 : 0);
	        output[6] =  ((i == 1 && j == 1 && k == 0) ? 1 : 0);
	        output[7] =  ((i == 1 && j == 1 && k == 1) ? 1 : 0);

	        return output;
    }

}
