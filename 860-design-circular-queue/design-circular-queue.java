class MyCircularQueue {

    int[] a;
    int front;
    int size;
    int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        a = new int[k];
        front = 0;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (size == capacity){
            System.out.print("Queue is full!");
            return false;
        }
        int rear = (front + size) % capacity;
        a[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (size == 0){
            System.out.print("Queue is empty!");
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        if (size == 0) return -1;
        return a[front];
    }
    
    public int Rear() {
        if (size == 0) return -1;
        int rear = (front + size - 1) % capacity;
        return a[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */