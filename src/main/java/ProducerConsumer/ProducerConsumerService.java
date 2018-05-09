package ProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

    public static void main(String[] args) {

        final int consumer_count = 1;
        final int producer_count = 5;

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);


        for(int i=0;i<producer_count;++i){
            Producer producer = new Producer(queue,"producer"+i);
            new Thread(producer).start();
        }

        for (int i = 0; i < consumer_count; ++i) {
            Consumer consumer = new Consumer(queue, "consumer" + i);
            new Thread(consumer).start();
        }


    }

}
