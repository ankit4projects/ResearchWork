package ankit.practice.collections.linkedlist.customized;

public class LinkedList {
	
	Node startNode = null;
	Node lastNode = null;
	
	public boolean add(Node node) {
		if (startNode == null) {
			startNode = node;
			lastNode = node;
			return true;
		} else {
			lastNode.setNext(node);
			return true;
		}
	}
	
	public Node get(Node node) {
		if(startNode == null) {
			return null;
		}
		
		Node currentNode = startNode;
		while(currentNode != null) {
			if(currentNode.getData().equals(node.getData())) {
				return currentNode;
			}
			currentNode = startNode.getNext();
		}
		
		return null;
	}
}
