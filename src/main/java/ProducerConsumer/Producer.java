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
        //produce Strings
        for (int i = 0; i < 100; i++) {
            String msg = producerName + ":" + i;
            try {
//                Thread.sleep(i);
                queue.put(msg);
                System.out.println(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

