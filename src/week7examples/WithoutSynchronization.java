package week7examples;

public class WithoutSynchronization{
    public static void main(String[] args){
        IntegerWrapper sum = new IntegerWrapper(0);
        Thread[] threads = new Thread[1000];

        for(int i=0; i<threads.length; i++){
            threads[i] = new Thread(new IncrementTask(sum));
        }

        for(Thread thread : threads){
            thread.start();
        }

        for(Thread thread : threads){
            try{
                thread.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Final sum without synchronization: " + sum.value);
    }
}
class IntegerWrapper { //without synchronization
    public int value;

    public IntegerWrapper(int value){
        this.value = value;
    }
}

class IncrementTask implements Runnable{
    private final IntegerWrapper sum;

    public IncrementTask(IntegerWrapper sum){
        this.sum = sum;
    }


    @Override
    public void run() {
        sum.value++; //Non-synchronized increment
    }
}

