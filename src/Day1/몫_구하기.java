package Day1;

public class 몫_구하기 {

	public static void main(String[] args) {
		System.out.println(solution(10, 5));
		System.out.println(solution(7, 2));
	}
	
	public static int solution(int num1, int num2) {
	    int answer = num1 / num2;
	    return answer;
	}
}
