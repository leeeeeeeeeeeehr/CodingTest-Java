package Day3;

public class 머쓱이보다_키_큰_사람 {
	public static void main(String[] args) {
		int[] array1 = {149, 180, 192, 170};
		System.out.println(solution(array1, 167));
		
		int[] array2 = {180, 120, 140};
		System.out.println(solution(array2, 190));
	}
	
	public static int solution(int[] array, int height) {
        int result = 0;
        
        for (int i=0; i<array.length; i++) {
            if (array[i] > height) {
                result++;
            }
        }
        return result;
    }
}
