package Day2;

public class 배열의_평균값 {
	public static void main(String[] args) {
		int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(numbers1));
		
		int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution(numbers2));
	}
	
	public static double solution(int[] numbers) {
	        
		double sum = 0;
			for (int i = 0; i < numbers.length; i++) {
			    sum += numbers[i];
			}        
		return sum / numbers.length;
	}
}
