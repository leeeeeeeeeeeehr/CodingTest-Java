package Day2;

import java.util.Arrays;

public class 분수의_덧셈 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
	}
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
     
        for (int i = 2; i <= denom; i++) {
            if ((denom % i == 0) && (numer % i == 0)) {
                numer = numer / i;
                denom = denom / i;
            }           
        }
        
        for (int i = 2; i <= numer; i++) {
            if ((denom % i == 0) && (numer % i == 0)) {
                numer = numer / i;
                denom = denom / i;
            }           
        }
        
        int[] result = {numer, denom};
        return result;
    } 
}
