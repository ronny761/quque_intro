

public class Queue<T> {
	private Node<T> first;
	private Node<T> last;
	
	public Queue() {
		this.first = null;
		this.last = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insert(T x) {
		Node<T> tmp = new Node<T>(x);
		if(this.last ==null)
			this.first = tmp;
		else
			this.last.setNext(tmp);
		this.last = tmp;
	}

	public T remove() {
		T x = this.first.getValue();
		this.first = this.first.getNext();
		if(this.first == null)
			this.last = null;
		return x;
	}

	public T head() {
		return this.first.getValue();
	}

}
