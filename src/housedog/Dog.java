package housedog;

import zookeeper.Animal;

// Dog 클래스에 name 이라는 객체변수와 setName 이라는 메소드를 만들지 않았지만 Animal클래스를 상속을 받았기 때문에 그대로 사용이 가능하다.
public class Dog extends Animal {
    public void sleep() {
        System.out.println(this.name+"는 쿨쿨쿨");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("뽀삐");
        System.out.println(dog.name);
        dog.sleep();
    }

}
