package exercise;

public class 짝수홀수개수 {
	public static void main(String[] args) {
		solution(null);

	}

	private static int[] solution(int[] num_list) {
		int cntEven = 0; //짝수개수
		int cntOdd = 0; //홀수개수
		
		//System.out.println("어, 나 리스트 갯수!! : "+num_list.length);
		
		for(int i=0; i < num_list.length; i++) {
		
			if(num_list[i]%2 == 0) {
				cntEven++; //짝수개수 증가
				//System.out.println(num_list[i]);
				
			}else {
				cntOdd++; //홀수개수 증가
			}
		}
		int[] answer = {cntEven,cntOdd}; //소스는 위에서 아래로흐른다.
		return answer;
	}

}
