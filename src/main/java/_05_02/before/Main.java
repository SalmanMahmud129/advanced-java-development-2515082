package _05_02.before;

public class Main {

    public static void main(String[] args) {
        Thread threadOne = new ThreadExample();
        Thread threadTwo = new ThreadExample();

        threadOne.setName("First Thread");
        threadTwo.setName("Second Thread");

        threadOne.start();
        threadTwo.start();
    }

}
