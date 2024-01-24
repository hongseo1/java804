package sec02.exam01;

public class AnonymousExample {//익명 객체는 한번만 사용할 때 사용

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//익명 객체 필드 사용
		anony.field.wake();
		
		//익명 객체 로컬변수 사용
		anony.method1();
		
		//익명 객체 매개값(파라멘터) 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합시다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		);
	}

}
