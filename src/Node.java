import java.util.HashMap;
import java.util.Map;

public class Node {
	String id;
	public Map<String, Node> adjacentNodes = new HashMap<>();
	public Map<String, Integer> edges = new HashMap<>();

	int tentativeDistance = -1;

	public Node(String id){
		this.id = id;
	}

	public void connect(Node newNode, int distance){
		this.adjacentNodes.put(newNode.id, newNode);
		this.edges.put(newNode.id, distance);

		newNode.adjacentNodes.put(this.id, this);
		newNode.edges.put(this.id, distance);
	}

	public void disconnect(Node newNode){
		this.adjacentNodes.remove(newNode.id);
		this.edges.remove(newNode.id);

		newNode.adjacentNodes.remove(this.id);
		newNode.edges.remove(this.id);
	}
}