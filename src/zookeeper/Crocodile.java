package zookeeper;

public class Crocodile extends Animal implements Predator, Barkable{
    public String getFood() {
        return "거북이";
    }
    public void bark() {
        System.out.println("이빨을 닦아주지 않으면 지나갈 수 없다.");
    }
}
