package zookeeper;

// Lion 클래스를 위에서 작성한 BarkablePredator 인터페이스를 구현하도록 수정하고 Bouncer 클래스를 실행하더라도 동일한 결과값이 출력되는 것을 확인 할 수 있다.
public class Lion extends Animal implements BarkablePredator{
    public String getFood() {
        return "얼룩말";
    }
    public void bark() {
        System.out.println("털을 빗어주지 않으면 지나갈 수 없다.");
    }
}

