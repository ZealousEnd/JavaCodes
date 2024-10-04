import java.util.LinkedList;

public class LinkedListQueue<T> implements Queue<T> {

    private LinkedList<T> elements;

    public LinkedListQueue() {
        // Initialize the LinkedList to hold elements of type T
        elements = new LinkedList<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    // Insert operation: Enqueues an item at the back of the queue
    @Override
    public void enqueue(T item) {
        elements.addLast(item); // Using LinkedList's addLast method to add item to the back
    }

    // Return operation: Returns the item at the front of the queue without removing it
    @Override
    public T peek() {
        return elements.peekFirst(); // Using LinkedList's peekFirst method to get the front item
    }

    // Delete and return operation: Removes and returns the item at the front of the queue
    @Override
    public T dequeue() {
        return elements.poll(); // Using LinkedList's poll method to remove and return the front item
    }
}
