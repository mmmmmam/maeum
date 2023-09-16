package exercise;

public class MemberLogin {
	
	public static void main(String[] args) {
		print();
		
//		MemberService memberService = new MemberService();
//		boolean result = memberService.login("hong", "12345");
//		
//		if(result) {
//			System.out.println("로그인 되었습니다.");
//			//memberService.logout("hong");
//		} else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}
	}
	
	public static void print() {
		Printer p = new Printer();
		Printer.println(10); //메서드 호출
		Printer.println(true);
		p.println(5.7);
		p.println("홍길동");
	}

	
}
