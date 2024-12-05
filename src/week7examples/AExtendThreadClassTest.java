package week7examples;

public class AExtendThreadClassTest {
    public static void main(String args[]){
        PrintNameThread pnt1 = new PrintNameThread("A");
        pnt1.start(); //start the first thread
        PrintNameThread pnt2 = new PrintNameThread("B");
        pnt2.start();

    }

}

class PrintNameThread extends Thread{
    PrintNameThread(String name){
        super(name); //it creates a Thread with this name
    }

    public void run(){
        String name = getName(); //gets the name of the thread
        for(int i=0; i<100; i++) {
            System.out.println(name);
            Thread.yield();
        }
    }
}