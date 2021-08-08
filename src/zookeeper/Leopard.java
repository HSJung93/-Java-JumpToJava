package zookeeper;

public class Leopard extends Animal implements Predator, Barkable{
    public String getFood() {
        return "가젤";
    }
    public void bark() {
        System.out.println("점의 갯수를 세지 않으면 지나갈 수 없다.");
    }
}
