package zookeeper;

public class Animal {
    // protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("바비");  // 메소드 호출
        Animal dog = new Animal();
        dog.setName("해피");

        //객체 변수는 공유되지 않는다
        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
