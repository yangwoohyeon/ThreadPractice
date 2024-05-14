package tutering;
import tutering.Calculator;

public class User2Thread extends Thread{

    private Calculator caculator;
    private Calculator calculator;
    public User2Thread(){
            setName("User2Thread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator=calculator;
    }
    public void run(){
        calculator.setMemory1(50);
    }
}
