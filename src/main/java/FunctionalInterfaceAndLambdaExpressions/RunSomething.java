package FunctionalInterfaceAndLambdaExpressions;

@FunctionalInterface
public interface RunSomething {
    /*
    🍕 함수형 인터페이스 (Functional Interface)
    ● 추상 메소드를 딱 하나만 가지고 있는 인터페이스
    ● SAM (Single Abstract Method) 인터페이스
    ● @FunctionInterface 애노테이션을 가지고 있는 인터페이스
    ● 함수형 인터페이스는 람다식 또는 메서드 참조로 구현할 수 있다.
    */

    // 함수형 인터페이스의 유일한 추상 메소드
    int doIt(int num);

    // interface 내부에서 static 키워드를 사용할 수 있고, 접근제어자(public) 생략이 가능하다.
    // static 메소드는 해당 인터페이스 타입의 인스턴스 없이도 호출이 가능하다.
    static void printName() {
        System.out.println("chanmin");
    }

    // default 같은 키워드 사용 가능
    // default 메소드는 인터페이스를 구현한 클래스에서 재정의할 수 있다.
    default void printAge() {
        System.out.println("27");
    }
}
