package Wątki;

class Runner implements Runnable {


//    int sinia (long n ){
//
//    }

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
}


public class Main {

    public static void main(String[] args) {

//        Thread thread = new Thread(new Runner());
//        Thread thread1 = new Thread(new Runner());
//        thread.start();
//        thread1.start();



        //użycie klasy anonimowej, przekazanie obiektu, którego nie ma

        Thread thread = new Thread(new Runnable() {
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
        });

        thread.start();


    }
}
