package java_book;

public class Ex32 {
	public static void main(String[] args) {
		Member obj1 =new Member("blue");
		Member obj2 = obj1;
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("bj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		obj1.id = "Yellow";
		
		System.out.println(obj1.id);
		System.out.println(obj2.id);
		System.out.println(obj3.id);
		
	}
}

class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
}