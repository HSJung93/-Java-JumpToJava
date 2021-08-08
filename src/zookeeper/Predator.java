package zookeeper;

public interface Predator {

    // 인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. getFood라는 메소드는 인터페이스를 implements한 클래스들이 구현해야만 하는 것이다. 인터페이스는 규칙이다!
    public String getFood();
}
