import static java.lang.Thread.sleep;

public class Main {
    static int counter = 0;
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            Counter t = new Counter();
            t.start();



            // we wait for last thread to close, and we make a little bit of sleep to make sure are the threads are closed before the print the Counter.
            if (i==9) {
                try {
                    t.join();
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("catch an error!");
                }
            }



        }


        System.out.println(counter);
    }
}