package programmers;

public class 배열의평균값 {

	public static void main(String[] args) {
		solution(null);

	}

	private static double solution(int[] numbers) {
		
		double answer = 0;
		int sum = 0;

		for (int i : numbers) {
			sum += i;
		}
		answer = (double) sum/numbers.length;
        return answer;
		
	}

}
