package exercise;

import java.util.Scanner;

public class Test0901 {

	public static void main(String[] args) {
		
		f9();
	
	}

	private static void f9() {
		int[] scores= null;
		Scanner sc = new Scanner(System.in);
/*//		/*
//		 * while(true) { menu(); int seln = sc.nextInt(); if(seln ==5) {
//		 * System.out.println("프로그램 종료"); break; }
//		 * 
//		 * switch (seln) { case 1: System.out.print("학생수>"); int num1 = sc.nextInt();
//		 * scores = new int[num1]; break; case 2: for(int i=0;i<scores.length;i++) {
//		 * System.out.printf("scores[%d]>", i); scores[i] = sc.nextInt(); }
//		 * 
//		 * break;
//		 * 
//		 * case 3: for(int i=0;i<scores.length;i++) {
//		 * System.out.printf("scores[%d]:%d\n", i, scores[i]); } break; case 4:
//		 * 
//		 * break;
//		 * 
//		 * 
//		 * default: break;
//		 * 
//		 * }
//		 * 
//		 * 
//		 * 
//		 * }
//		 * 
//		 * sc.close();
//		 */
		
		if (f3("3")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
	private static void menu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------");
		System.out.print("선택> ");
		
	}
	
	private static boolean f3(String flag1) {
		
		if(flag1 =="1") {
			System.out.println("1 맞네!! ㅎㅎ ");
		}else {
			System.out.println("1 아닌디? ");
			System.out.print("니가 입력한건 "+ flag1 +"이야!\n");
			return false;
		} 

		return true;
	}
	
	
	

}
