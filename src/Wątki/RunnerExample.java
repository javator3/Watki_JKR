package Wątki;

public class RunnerExample extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello: " + i + "thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {

        RunnerExample runnerExample = new RunnerExample();
        RunnerExample runnerExample2 = new RunnerExample();
        runnerExample.start();
        runnerExample2.start();


    }
}

