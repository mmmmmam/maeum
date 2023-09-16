package exercise;

public class Member12 {
	
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
