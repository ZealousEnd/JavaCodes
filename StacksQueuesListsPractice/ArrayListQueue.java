import java.util.ArrayList;

public class ArrayListQueue<T> implements Queue<T> {
	
	private ArrayList<T> elements;
	
	public ArrayListQueue() {

	}

    @Override
    public int size() {

    }

    @Override
    public boolean isEmpty() {

    }
	
    // this is the "insert" operation
    // in a queue, new items are inserted at the "back" of the queue
    @Override
	public void enqueue(T item) {

	}

    // this is the "return but don't delete" operation
    // in a queue, the "next" items are returned from the "front" of the queue
    @Override
	public T peek() {

	}

    // this is the "delete and return" operation
    // in a queue, the "next" items are deleted from the "front" of the queue
    @Override
	public T dequeue() {

	}
	

} // end class ArrayListQueue
