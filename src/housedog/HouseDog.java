package housedog;

// 자바는 다중 상속을 지원하지 않는다.
public class HouseDog extends Dog {
    // Method overriding
    public void sleep() {
        System.out.println(this.name+"는 집에서만 쿨쿨쿨");
    }

    // Method overloading
    public void sleep(int hour) {
        System.out.println(this.name+"는 집에서만 " + hour + " 시간 동안 쿨쿨쿨");
    }

    //  메소드명이 클래스명과 동일하고 리턴 자료형이 없는 메소드를 생성자(Constructor)라고 말한다. 필수적인 행동을 객체 생성시에 제어할 수 있게 된다.
    public HouseDog(String name) {
        this.setName(name);
    }

    // 생성자 오버로딩: 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
    public HouseDog(int type) {
        if (type == 1) {
            this.setName("요크셔");
        } else if (type == 2) {
            this.setName("불독");
        }
    }
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog("해피");
        // houseDog.setName("해피");
        houseDog.sleep();
        houseDog.sleep(3);   // sleep(int hour) 메소드 호출

        HouseDog happy = new HouseDog("해피");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire.name);


    }
}
