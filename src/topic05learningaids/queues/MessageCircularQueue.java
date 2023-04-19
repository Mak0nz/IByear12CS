package topic05learningaids.queues;

// Message queue is a thread so that it can run in parallel to the main java thread.
public class MessageCircularQueue extends Thread {

    // --- Attributes (state) ---
    Message[] queue;

    int headIndex;

    int tailIndex;

    // --- The Constructor ---
    public MessageCircularQueue() {
        queue = new Message[5];
        headIndex = 0;
        tailIndex = headIndex;
    }
    
    // --- A method for the Thread ---
    public void run() {
        // try to dequeue a message
        // if message then... process the message (read)
        // else... no
        // wait a bit
        // go back to step 1 indefinitely
    } 

    // --- Behaviour ---
    public void enqueue(Message m) {
        // not full
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex = (tailIndex+1) % queue.length;
        }
    }

    public Message dequeue() {
        // check not empty because if empty cannot deque
        if (!isEmpty()) {
            Message m = queue[headIndex]; // get message at the head
            // shift all the elements up one
            for (int i = (headIndex + 1); i <= (tailIndex -1); i++) {
                Message shift = queue[i];
                queue[i-1] = shift;
                queue[i] = null;
            }
            return m;
        }
        return null;
    }

    public boolean isEmpty() {
        return tailIndex == headIndex;
    }

    public boolean isFull() {
        return queue.length == tailIndex;
    }

}