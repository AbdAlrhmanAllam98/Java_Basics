
package Threading;


import java.util.ArrayList;

public class SearcherThread extends Thread{

    int start,end;
    ArrayList<Integer> data;
    int v;
    String threadName;
    static boolean isFound=false;

    public SearcherThread(int start, int end, ArrayList<Integer> data, int v,
            String threadName) {
        this.start = start;
        this.end = end;
        this.data = data;
        this.v = v;
        this.threadName=threadName;
    }

    @Override
    public void run() {
        for(int i=start;i<end;i++){
            if(isFound){
                System.out.println(threadName+" has stopped it self");
                return;
            }
            if(data.get(i)==v){
                isFound=true;
                System.out.println(threadName+" has found value in index "+i);
                return;
            }
        }
        System.out.println(threadName+" has finished");
    }
  
}
