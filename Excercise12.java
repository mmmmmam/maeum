package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Excercise12 {

	public static void main(String[] args) {
		sol17();

	}

	public static void sol17() {
		 String id = "5Angel1004";
		 String id2 = "mAeum99hh";
		 String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}"; //정규식표현
		 
		 boolean isMatch = Pattern.matches(regExp, id2); //Pattern.matches(비교기준(정규표현), 비교대상)
		 //패턴에 비교해서 매치되면 true, 매치되지 않으면 false
		 if(isMatch) {
			 System.out.println("ID로 사용할 수 있습니다.");
		 } 
		 else {
			 System.out.println("ID로 사용할 수 없습니다.");
		 }
		
	}

	public static void sol16() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분"); //포맷설정
		String today2 = today.format(cal.getTime());
		
		System.out.println(today2);
				
				
		
	}

	public static void sol15() {
		//D-Day구하기
		Calendar cal = Calendar.getInstance();
		//Month는 0부터 11까지로 구성되있기때문에 12월은 11로 표시
		cal.set(2023, 11, 31); //cal 변수에 구하고자하는 dDay날짜 설정하기
		
		long dDay = cal.getTimeInMillis();
		long today = System.currentTimeMillis();
		long result = dDay - today;
		
		System.out.println(result/(1000*60*60*24));
		
//		String strDate = "2023-12-31";  // 기준 날짜 데이터 (("yyyy-MM-dd")의 형태)
//		String todayFm = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())); // 오늘날짜
//		 
//		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		 
//		  Date date;
//		  Date today1; 
//		  long calculate; 
//		try {
//			date = new Date(dateFormat.parse(strDate).getTime());
//			today1= new Date(dateFormat.parse(todayFm).getTime());
//			
//			calculate  = date.getTime() - today1.getTime();
//			
//			int Ddays = (int) (calculate / ( 24*60*60*1000));
//			  
//			  System.out.println("두 날짜 차이일 : " + Ddays);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
	}  
	
	public static void sol12() {
			
		System.out.println( obj1 == obj2);
		System.out.println( obj3 == obj4); //false
					 
		System.out.println( obj3.intValue());
		System.out.println( obj3 == obj3.intValue());
		System.out.println( obj4 == obj4.intValue());
		System.out.println( obj3.intValue() == obj4.intValue());
			
//		System.out.println( obj1.equals(obj2) );
//		System.out.println( obj3.equals(obj4) );
		
	}
	
	public static void sol11() {
		
		StringTokenizer stringTokenizer = new StringTokenizer("아이디,이름,패스워드", ",");
		
		for(int i=0;i<=stringTokenizer.countTokens()+1;i++) { //왜 플러스1?
			System.out.println(stringTokenizer.nextToken());
		}
	}
	
	public static void sol10() {
		
		StringBuilder stringBuilder = new StringBuilder(); //객체생성
		
		 for(int i=1; i<= 100; i++) {
			 stringBuilder.append(i);
		 }
		 System.out.println(stringBuilder);
		// System.out.println(str);
		 
	}
	
	public static void sol8() {
		
		long start = System.currentTimeMillis();
		
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long end = System.currentTimeMillis();
		
		System.out.println("시작시간 :"+ start /1000);
		System.out.println("종료시간 :"+ end /1000);
		System.out.println("실행시간 :"+ (end-start) /1000);

	}
	
	public static void sol6() {
		
		private String id; //변수선언
		private String name;
		
		public Member12(String id, String name) { //생성자
			this.id = id;
			this.name = name;
		}
		
		//여기에 코드를 작성하세요
		@Override
		public String toString() {
			
			return this.id + ": " + this.name;
			
		}
		
	}
	public static void sol5() {
		
		private String studentNum;
		
		public Student(String studentNum) {
			
			this.studentNum = studentNum;
		}
		
		public String getStudentNum() {
			return studentNum;
		}
		
		//여기에 코드를 작성하세요.
		@Override
		public int hashCode() {
			return Objects.hash(studentNum);
		}

		@Override
		public boolean equals(Object obj) {
			
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(studentNum, other.studentNum);
			
		}
	}
	
}
