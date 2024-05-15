package tutering;

public class Main extends Thread {

    public static void main(String[] args) { // 메인함수
        Calculator calculator = new Calculator();

        UserThread user1Thread = new UserThread();
        user1Thread.setCalculator(calculator);
        user1Thread.start();

        User2Thread user2Thread = new User2Thread();
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}