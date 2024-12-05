package week7examples;

public class WithSynchronization {
    public static void main(String[] args){
        IntegerWrapper sum = new IntegerWrapper(0);
        Thread[] threads = new Thread[1000];

        for (int i=0;i<threads.length; i++){
            threads[i] = new Thread(new IncrementTaskWithSync(sum));
        }

        for(Thread thread : threads){
            thread.start();
        }

        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Final sum with synchronization: " + sum.value);
    }
}


class IncrementTaskWithSync implements Runnable{
    private final IntegerWrapper sum;

    public IncrementTaskWithSync(IntegerWrapper sum){
        this.sum = sum;
    }

    @Override
    public void run() {
        synchronized (sum){
            sum.value++;
        }
    }
}


