package Day3;

public class 중복된_숫자의_개수 {
	public static void main(String[] args) {
		int[] array1 = {1, 1, 2, 3, 4, 5};
		System.out.println(solution(array1, 1));
		
		int[] array2 = {0, 2, 3, 4};
		System.out.println(solution(array2, 1));
	}
	
	public static int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
}
