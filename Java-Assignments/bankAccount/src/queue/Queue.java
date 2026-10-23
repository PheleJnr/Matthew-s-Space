package queue;

public class Queue {
    private int count;
    private String[] queueContents = new String[5];
    private int head;

    public boolean isEmpty() {
        return count == 0;
    }


    public String add(String element) {
        boolean isFull = true;

        for(int count = 0; count < queueContents.length; count++){
            if(queueContents[count] == null){
                isFull = false;
                break;
            }
            if(isFull) {
                throw new IllegalArgumentException("Queue is Full");
            }
        }
        return queueContents[count++];

    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty");
        }
        return queueContents[--count];
    }

    public boolean offer(String element) {
        if (count != queueContents.length) {
            queueContents[count] = element;
            count++;
            return true;
        }
        return false;
    }

    public String poll() {
        if(head > queueContents.length)return null;
        return queueContents[head++];
    }

    public String peek() {
        if (head > queueContents.length) return null;
        return queueContents[head];
    }

}
