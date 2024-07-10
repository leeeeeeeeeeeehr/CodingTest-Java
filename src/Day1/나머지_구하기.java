package Day1;

public class 나머지_구하기 {
	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(10, 5));
	}
	
	public static int solution(int num1, int num2) {
        int last = num1 % num2;
        return last;
    }
}
