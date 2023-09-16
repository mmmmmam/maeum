package exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("MBTI유형의 성격을 검색해보자!!");
		System.out.print("==================================================\n");
		event1();
		
	}
	
	public static void event1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 MBTI를 입력하세요 >>");
		String inputMbti = sc.nextLine(); 
		sc.close();
	
		String personality = getMbti(inputMbti.toUpperCase());
	
		if (!personality.equals("FAIL")) {
			System.out.print("==================================================\n");
			System.out.printf("[%s]유형의 성격은 아래와 같습니다. ^^\n\n",inputMbti);
			System.out.println(">> "+personality);
			System.out.print("==================================================\n");
		}else {
			System.out.print("==================================================\n");
			System.out.print("[입력오류] 16개 유형의 MBTI중 한가지를 정확히 입력해주세요.\n");
			System.out.print("==================================================\n");
		}

	}
	
	public static String getMbti(String inputMbti) {
		String[][] mbtiList = MakeMbtiList.makeList();
		String personality = "FAIL";
		
		for(int i = 0; i<mbtiList.length; i++){
			
			if(mbtiList[i][0].equals(inputMbti)) {
				personality = mbtiList[i][1];
			}
		}
		
		return personality;
	};

	
	
}
