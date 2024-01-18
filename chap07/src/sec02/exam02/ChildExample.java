package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();

		Parent parent = child;
		parent.method1();
		parent.method2(); //재정의한게 실행
		//parent.method3(); //(호출 불가능)
		
		
		//부모를 형변환 했던 거는 다시 형변환이 가능하지만, 처음부터 자식으로 형변환은 불가 
		Child child2 = (Child)parent; //강제 형변환
		child2.method3(); //(호출 가능)
	}

}
