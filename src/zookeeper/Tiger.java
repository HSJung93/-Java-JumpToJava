package zookeeper;

// extends로 클래스를 상속하고, implements로 인터페이스를 구현한다.
// 인터페이스는 콤마(,)를 이용하여 여러개를 implements 할 수 있다.
public class Tiger extends Animal implements Predator, Barkable {
    public String getFood() {
        return "멧돼지";
    }

    public void bark() {
        System.out.println("곶감이 없으면 지나갈 수 없다.");
    }
}
