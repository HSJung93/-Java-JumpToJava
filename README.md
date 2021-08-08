# 점프 투 자바 코드 저장소 입니다.

## 자료형
* Array는 자료형의 종류가 아니라 자료형의 집합이다.
* List는 Array와는 달리 크기가 정해져 있지 않다.
* List 자료형에는 ArrayList, LinkedList 등의 List interface를 구현한 자료형이 있다.
* `<String>` 이라는 제너릭스 표현식은 ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다라는 것을 의미한다. 제너릭스를 사용하지 않는 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. 따라서 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 형변환을 해주어야 한다.

## 객체지향 프로그래밍
* 객체 변수는 공유되지 않는다
* 메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자(Constructor)라고 말한다. 필수적인 행동을 객체 생성시에 제어할 수 있게 된다.
* 생성자 오버로딩: 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
* extends로 클래스를 상속하고, implements로 인터페이스를 구현한다.
* 인터페이스는 콤마(,)를 이용하여 여러개를 implements 할 수 있다.
* 인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다. 인터페이스는 규칙이다!
* Lion 클래스를 위에서 작성한 BarkablePredator 인터페이스를 구현하도록 수정하고 Bouncer 클래스를 실행하더라도 동일한 결과값이 출력되는 것을 확인 할 수 있다.

## 접근제어자/ 정적 변수와 메소드
* 싱글톤은 단 하나의 객체만을 생성하게 강제하는 패턴이다.
* 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점을 볼 수 있게 된다. 또한 static 으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 된다.
* Class는 Static 영역에 생성되고, new 연산을 통해 생성한 객체는 Heap영역에 생성된다. 객체의 생성시에 할당된 Heap영역의 메모리는 Garbage Collector를 통해 수시로 관리를 받는다. 하지만 Static 키워드를 통해 Static 영역에 할당된 메모리는 모든 객체가 공유하는 메모리라는 장점을 지니지만, Garbage Collector의 관리 영역 밖에 존재하므로 Static을 자주 사용하면 프로그램의 종료시까지 메모리가 할당된 채로 존재하므로 자주 사용하게 되면 시스템의 퍼포먼스에 악영향을 주게 된다.

## 예외처리/ 쓰레드
* Exception in thread "main" java.io.FileNotFoundException:
* Exception in thread "main" java.lang.ArithmeticException:
* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
* 트랜잭션은 하나의 작업 단위를 뜻한다.
* 모두 취소하는 행위를 롤백(Rollback)이라고 말한다.
* 동작하고 있는 프로그램을 프로세스(Process)라고 한다. 보통 한 개의 프로세스는 한 가지의 일을 하지만, 쓰레드를 이용하면 한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있게 된다.
