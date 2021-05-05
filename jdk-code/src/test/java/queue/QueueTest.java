package queue;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author wangdan
 * @date 2021/4/28
 */
public class QueueTest {

    @Test
    public void testOffer(){
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);
        queue.offer("123");
        System.out.println( queue.offer("346"));

    }
}
