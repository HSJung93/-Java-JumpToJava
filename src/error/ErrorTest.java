package error;

public class ErrorTest {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    // FoolException 처리를 sayNick 메소드에서 하는것이 좋을까? 아니면 main 메소드에서 하는것이 좋을까?
    public static void main(String[] args) {
        ErrorTest test = new ErrorTest();
        try {
            test.sayNick("fool");
            test.sayNick("genious");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
