package _05_02.before;

public class ThreadExample extends Thread {
    @Override
    public void run(){
        System.out.println("Hello world from " + this.getName());
    }
}
