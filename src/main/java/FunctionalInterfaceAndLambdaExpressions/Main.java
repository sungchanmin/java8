package FunctionalInterfaceAndLambdaExpressions;

public class Main {
    public static void main(String[] args) {
        /*
        🍕 람다 표현식 (Lambda Expressions)
        ● 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
          (함수형 인터페이스가 람다식의 대상이 될 수 있다.)
        ● 코드를 줄일 수 있다.
          (익명 클래스를 사용하지 않고 간결하게 표현 가능하다.)
        ● 메소드 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.
          (람다 표현식은 하나의 객체처럼 동작한다.)

        🍕 자바에서 함수형 프로그래밍
        ● 함수를 First class object(일급 객체)로 사용할 수 있다.
          (함수를 값처럼 전달하거나 반환할 수 있다.)

          일급 객체는 변수나 데이터에 담을 수 있고,
          함수의 파라미터로 전달 할 수 있으며,
          함수의 리턴값으로 사용 할 수 있어야 한다.

        ● 순수 함수 (Pure function)
            ○ 참조 투명성 (Referential Transparency) : 같은 입력이 들어오면 항상 같은 결과를 반환한다.
            ○ 사이드 이팩트가 없다. (함수 외부의 상태를 변경하지 않는다.)
            ○ 상태가 없다. (함수 외부의 값을 사용하지 않는다.)
        ● 고차 함수 (Higher-Order Function)
            ○ 함수가 함수를 매개변수로 받을 수 있고, 함수를 리턴할 수도 있다.
        ● 불변성 (Immutability)
            ○ 함수형 프로그래밍에서 사용되는 값은 변하지 않는다.
        */

        // 익명 클래스를 사용하여 함수형 인터페이스를 구현한 방식
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int number) {
                return number + 10;
            }
        };

        // 위 익명 클래스 코드를 람다 표현식으로 변환한 코드
        // 함수형 인터페이스의 추상 메소드(doIt)를 람다식으로 구현
        RunSomething runSomethingLambda = number -> number + 10;

        // 람다식을 사용한 함수 호출, 동일한 입력값에 대해 같은 출력값을 반환
        System.out.println(runSomethingLambda.doIt(1)); // 출력: 11
        System.out.println(runSomethingLambda.doIt(1)); // 출력: 11
        System.out.println(runSomethingLambda.doIt(1)); // 출력: 11
    }
}

