package _05_03.before;


public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.println("Hello World from a lambda Runnable"));

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();
    }

}
