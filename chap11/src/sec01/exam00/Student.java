package sec01.exam00;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; //this=class / obj 전달 받은 객체
		if(obj == null || getClass() != obj.getClass()) return false;
		Student student = (Student) obj;
		return age == student.age && Objects.equals(name, student.name);
	}
	
	@Override
	public int hashCode() {//주소를 동일하게
		return Objects.hash(name, age);
	}
}
