//Write a program to implement circular array
public class QueueCircular {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        public Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                // If there's only one element in the queue
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
