package Day1;

public class 두_수의_차 {

	public static void main(String[] args) {
		System.out.println(solution(2, 3));
		System.out.println(solution(100, 2));
	}
	
	public static int solution(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}
}
