public class Counter extends Thread {

    private int number;

//    public Counter(int x){
//        number = x;
//    }



    @Override
    public void run(){

        for (int i = 0; i < 1000; i++) {
            Main.counter++;
//            System.out.println(number + " -> " + ++Main.counter);
        }





    }


}
