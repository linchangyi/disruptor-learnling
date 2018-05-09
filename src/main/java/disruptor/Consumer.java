package disruptor;

import com.lmax.disruptor.EventHandler;

public class Consumer implements EventHandler<Element>{
    @Override
    public void onEvent(Element event, long sequence, boolean endOfBatch) throws Exception {
        System.out.println("Element: " + event.get());
    }
}
