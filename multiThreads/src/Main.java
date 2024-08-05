import static java.lang.Thread.sleep;

public class Main {
    static int counter = 0;
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            Counter t = new Counter();
            t.start();




                try {
                    t.join();
                } catch (InterruptedException e) {
                    System.out.println("catch an error!");
                }




        }


        System.out.println(counter);
    }
}