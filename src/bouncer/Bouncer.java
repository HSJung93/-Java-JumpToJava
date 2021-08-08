package bouncer;

import zookeeper.Barkable;
import zookeeper.Lion;
import zookeeper.Tiger;

public class Bouncer {

    public void barkAnimal(Barkable animal) {
        animal.bark();
    }

    // public void barkAnimal(Animal animal) {
    //     if (animal instanceof Tiger) {
    //         System.out.println("곶감이 없으면 지나갈 수 없다.");
    //     } else if (animal instanceof Lion) {
    //         System.out.println("털을 빗어주지 않으면 지나갈 수 없다.");
    //     } else if (animal instanceof Crocodile) {
    //         System.out.println("이빨을 닦아주지 않으면 지나갈 수 없다.");
    //     } else if (animal instanceof Leopard) {
    //         System.out.println("점의 갯수를 세지 않으면 지나갈 수 없다.");
    //     }
    // }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

        // Tiger 클래스의 객체는 다음과 같이 여러가지 자료형으로 표현할 수 있다.
        // Predator 로 선언된 predator 객체와 Barkable 로 선언된 barkable 객체는 사용할 수 있는 메소드가 서로 다르다.  predator 객체는 getFood 메소드만 호출이 가능하다. barkable 객체는 bark 메소드만 호출이 가능하다.
        // Tiger tiger = new Tiger();
        // Animal animal = new Tiger();
        // Predator predator = new Tiger();
        // Barkable barkable = new Tiger();

        // getFood 메소드와 bark 메소드를 모두 사용하고 싶다면, Predator, Barkable 인터페이스를 구현한 Tiger 로 선언된 tiger 객체를 사용하거나 getFood, bark 메소드를 모두 포함하는 새로운 인터페이스를 새로 만들어 사용하면 된다.

        // 추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 구현체도 가지고 있는 자바의 돌연변이 같은 클래스이다. 혹자는 추상클래스는 인터페이스로 대체하는것이 좋은 디자인이라고도 얘기한다.


    }
}
