package tutering;
import tutering.Calculator;

public class UserThread extends Thread{
    private Calculator calculator;
    public UserThread(){
        setName("UserThread");
    }

    public void setCalculator(Calculator calculator){
        this.calculator=calculator;
    }
    public void run(){
        calculator.setMemory1(100);
    }
}
