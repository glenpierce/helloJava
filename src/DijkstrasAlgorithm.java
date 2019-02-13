import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgorithm {
	public static void main(String[] args) {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");

		a.connect(b, 1);
		a.connect(c, 1);
		b.connect(c, 1);
		c.connect(d, 2);
		c.connect(e, 3);
		e.connect(b, 1);
		f.connect(e, 1);
		f.connect(a, 5);

		List<Node> visited = new ArrayList<>();

		List<Node> unvisited = new ArrayList<>(Arrays.asList(a, b, c, d, e, f));
		a.tentativeDistance = 0;

		for(Node currentOrigin : unvisited) {
			for (Map.Entry<String, Node> currentDestination : currentOrigin.adjacentNodes.entrySet()) {
				if (currentOrigin.edges.get(currentDestination.getKey()) + currentOrigin.tentativeDistance < currentDestination.getValue().tentativeDistance || currentDestination.getValue().tentativeDistance == -1) {
					currentDestination.getValue().tentativeDistance = currentOrigin.edges.get(currentDestination.getKey()) + currentOrigin.tentativeDistance;
					System.out.println(currentDestination.getValue().id + " " + currentDestination.getValue().tentativeDistance);
				}
			}
		}

		System.out.println("----");

		for(Node node : unvisited){
			System.out.println(node.id + " " + node.tentativeDistance);
		}

		System.out.println("----");

		Node currentNode = f;
		List<Node> path = new ArrayList<>();

		while(!currentNode.id.equals("a")){
			Node nextNode = new Node("");
			nextNode.tentativeDistance = 100;
			for (Map.Entry<String, Node> node : currentNode.adjacentNodes.entrySet()) {
				if(node.getValue().tentativeDistance < nextNode.tentativeDistance){
					nextNode = node.getValue();
				}
			}
			path.add(nextNode);
			currentNode = nextNode;
		}

		System.out.println("result:");

		for(Node nodeInPath : path){
			System.out.println(nodeInPath.id);
		}
	}
}
