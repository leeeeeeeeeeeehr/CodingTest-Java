package Day3;

public class 짝수의_합 {
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(4));
	}
	
	public static int solution(int n) {
		int result = 0;
		
		for (int i = 0; i <= n; i++) {
		    if (i % 2 == 0) {
		        result += i;
		    }
		}
		return result;
	}
}
