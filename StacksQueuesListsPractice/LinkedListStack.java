import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {

    private LinkedList<T> elements;

    public LinkedListStack() {
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

    // Insert operation: Pushes an item onto the top of the stack
    @Override
    public void push(T item) {
        elements.push(item); // Using LinkedList's push method to add item to the top
    }

    // Return operation: Returns the item at the top of the stack without removing it
    @Override
    public T peek() {
        return elements.peek(); // Using LinkedList's peek method to get the top item
    }

    // Delete and return operation: Removes and returns the item at the top of the stack
    @Override
    public T pop() {
        return elements.pop(); // Using LinkedList's pop method to remove and return the top item
    }
}
