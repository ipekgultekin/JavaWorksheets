package week7examples;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Thread.sleep;

class SumWrapper{
    int sum=0;

    public void increment() throws InterruptedException{
        int sleepTime = new Random().nextInt(100)+1;
        sleep(sleepTime);
        sum++;
    }
}

public class SummerThreader extends Thread{
    public SumWrapper sum;

    public SummerThreader(SumWrapper sum) {
        this.sum = sum;
    }

    public static void main(String[] args) throws InterruptedException{
        ArrayList<SummerThreader> threaderArray = new ArrayList<>();
        SumWrapper sumWrapper = new SumWrapper();

        for (int i=0; i<1000; i++){
            SummerThreader newThread = new SummerThreader(sumWrapper);
            threaderArray.add(newThread);
        }

        for(Thread thread : threaderArray){
            thread.start();
        }

        for (Thread thread: threaderArray){
            thread.join();
        }

        System.out.println(sumWrapper.sum);

    }

    public void run(){
        try {
            sum.increment();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}