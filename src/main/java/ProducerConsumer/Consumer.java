package ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private String threadName;
    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> q, String name) {
        this.queue = q;
        this.threadName = name;
    }

    public void run() {
        try {
            String msg;
            //consuming Strings until exit String is received
            while (true) {
//                Thread.sleep(10);
                msg = queue.take();
                System.out.println( "Element: "+msg);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
