package zookeeper;

public class ZooKeeper {

    // public void feed(Tiger tiger) {
    //     System.out.println("멧돼지를 먹이로 줍니다.");
    // }

    // public void feed(Lion lion) {
    //     System.out.println("얼룩말을 먹이로 줍니다.");
    // }

    // 다형성: 객체는 한 가지 이상의 자료형 타입을 가진다. tiger와 lion은 Tiger와 Lion 클래스의 객체이면서 Predator 인터페이스의 객체이다.
    public void feed(Predator predator) {
        System.out.println(predator.getFood() + "을(를) 먹이로 줍니다.");
        // System.out.println("feed apple");
    }

    // 동물이 추가될 때 마다 feed 매소드를 계속 오버로딩해야하는가? => Predator 인터페이스를 작성하여 해결한다.
    // public void feed(Crocodile crocodile) {
    //     System.out.println("feed strawberry");
    // }

    // public void feed(Leopard leopard) {
    //     System.out.println("feed orange");
    // }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();
        Leopard leopard = new Leopard();


        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
        zooKeeper.feed(crocodile);
        zooKeeper.feed(leopard);

    }
}
