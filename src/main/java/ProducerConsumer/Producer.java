package ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private String producerName;
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> q, String producerName) {
        this.queue = q;
        this.producerName = producerName;
    }

    public void run() {
        int i=0;
        try {
            while (i<100){
//            Thread.sleep(i);
                String msg = "" + ++i;
                queue.put(msg);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

