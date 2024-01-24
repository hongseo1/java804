package sec02.exam01;

public class Anonymous {
	Person field = new Person() { // 필드 안에 class > 이름 없는 class (Anonymous) 구현객체를 필드에 만드는 방법
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() { // 구현객체를 메소드로 만드는 방법
		//로컬변수값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		//로컬변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
