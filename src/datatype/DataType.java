package datatype;

import java.util.ArrayList;
import java.util.HashMap;

public class DataType {

    public static void main(String[] args) {

        // Number
        int i = 0;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        // String
        String a = "Hello Java";
        System.out.println(a.indexOf("Java"));
        System.out.println(a.replaceAll("Java", "World"));
        System.out.println(a.substring(0, 5));
        System.out.println(a.toUpperCase());

        // + 할때마다 객체 생성
        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);

        // 객체 단 한번 생성
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        sb.insert(0, "hello ");
        System.out.println(sb.toString());

        //Array는 자료형의 종류가 아니라 자료형의 집합이다.
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        for (int j = 0; j<weeks.length; j++) {
            System.out.println(weeks[j]);
        }

        for (String day: weeks){
            System.out.println(day);
        }

        // List는 Array와는 달리 크기가 정해져 있지 않다.
        // List 자료형에는 ArrayList, LinkedList 등의 List interface를 구현한 자료형이 있다.

        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        // <String> 이라는 제너릭스 표현식은 ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다라는 것을 의미한다. 제너릭스를 사용하지 않는 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. 따라서 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 형변환을 해주어야 한다.

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));

        //Map
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.get("people"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.size());

    }

}
