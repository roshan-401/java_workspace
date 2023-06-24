package qns7;
import java.util.LinkedList;

class Buffer {
    private LinkedList<Integer> buffer;
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new LinkedList<>();
    }

    public void produce(int item) throws InterruptedException {
        synchronized (this) {
            while (buffer.size() == capacity) {
                wait(); // Wait if the buffer is full
            }

            buffer.add(item);
            System.out.println("Produced: " + item);
            notify(); // Notify the consumer that a new item is available
        }
    }

    public void consume() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait(); // Wait if the buffer is empty
            }

            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);
            notify(); // Notify the producer that an item has been consumed
        }
    }
}

class Producer implements Runnable {
    private Buffer buffer;
    private int itemCount;

    public Producer(Buffer buffer, int itemCount) {
        this.buffer = buffer;
        this.itemCount = itemCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= itemCount; i++) {
                buffer.produce(i);
                Thread.sleep(1000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;
    private int itemCount;

    public Consumer(Buffer buffer, int itemCount) {
        this.buffer = buffer;
        this.itemCount = itemCount;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= itemCount; i++) {
                buffer.consume();
                Thread.sleep(2000); // Simulate some processing time
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Buffer capacity is 5
        int producerItemCount = 10;
        int consumerItemCount = 10;

        Producer producer = new Producer(buffer, producerItemCount);
        Consumer consumer = new Consumer(buffer, consumerItemCount);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
