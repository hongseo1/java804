package test.exam01;

public class Child extends Parent{
    private String name;
    
    public Child(){ 
        // super(); //생략 되어있지만 1번으로 실행
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}