package Threading;

public class CounterThread extends Thread{

    String threadName;
    int size;

    public CounterThread(String threadName,int size) {
        this.threadName = threadName;
        this.size=size;
    }
    @Override
    public void run() {
         for(int i=0;i<size;i++){
             System.out.println(threadName + " "+i);
        }
    }
    
    
    
}
