package Day1;

public class 두_수의_나눗셈 {

	public static void main(String[] args) {
		System.out.println(solution(3, 2));
		System.out.println(solution(7, 3));
		System.out.println(solution(1, 16));
	}
	
	public static int solution(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        return (int) (result * 1000);
    }
}
