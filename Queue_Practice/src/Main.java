
public class Main {

	public static void main(String[] args) {
		//building a queue - 15|7|78|99|32|66
		Queue<Integer> q1 = new Queue<Integer>();
		q1.insert(15);
		q1.insert(7);
		q1.insert(78);
		q1.insert(99);
		q1.insert(32);
		q1.insert(66);
		
		//what????
		printQueue(q1);
		System.out.println(returnSize(q1));
	}
	//q2
	public void q2() {
		System.out.println(" i finished!");
	}
	/*
	 * return the size of queue
	 */
	public static int returnSize(Queue<Integer> q) {
		Queue<Integer> tmpQ = new Queue<Integer>();
		
		int counter = 0;
		while(!q.isEmpty()) {
			tmpQ.insert(q.remove());
			counter++;
		}
		while(!tmpQ.isEmpty()) {
			q.insert(tmpQ.remove());
		}
		return counter;
		
	}
	
	/*
	 * prints the queue in this formation: 15|7|78|99|32|66
	 */
	public static void printQueue(Queue<Integer> q) {
		
		while(!q.isEmpty()) {
			System.out.print(q.remove() +"|");
		}
		System.out.println();
		
	}

}
