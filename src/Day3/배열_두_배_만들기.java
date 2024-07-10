package Day3;

import java.util.Arrays;

public class 배열_두_배_만들기 {
	public static void main(String[] args) {
		int[] numbers1 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(solution(numbers1)));
		
		int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};
		System.out.println(Arrays.toString(solution(numbers2)));
	}
	
	public static int[] solution(int[] numbers) {  
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
