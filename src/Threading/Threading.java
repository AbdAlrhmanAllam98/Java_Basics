package Threading;

import java.util.ArrayList;

public class Threading {
    public static void main(String[] args) {
        
//        CounterThread counterThread =new CounterThread("Thread num one ");
//        CounterThread counterThread2 =new CounterThread("Thread num two ");
//
//        counterThread.start();
//        counterThread2.start();
        
        ArrayList<Integer> data= new ArrayList<>(10000000);
        for(int i=0;i<10000000;i++){
            data.add(i);
        }

        for(int i=0;i<10;i++){
        SearcherThread th=
                new SearcherThread(i*1000000, (i+1)*1000000, data, 5985777,"thread "+i);
        th.start();
        }
        
        
    }
    
}
