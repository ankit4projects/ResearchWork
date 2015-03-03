package ankit.practice.collections.linkedlist.customized;

public class Implementation {

	public static void main(String[] args) {
		Node n1 = new Node(new String("Ankit"), null);
		
		LinkedList list = new LinkedList();
		list.add(n1);
		
		Node n2 = new Node(new String("Ajay"), null);
		list.add(n2);
		
		Node n3 = new Node(new String("Raman"), null);
		list.add(n3);
	}
}
