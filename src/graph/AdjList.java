package graph;
import java.util.ArrayList;

public class AdjList {
	class GraphNode{
		int vertex;
		GraphNode link;
		public GraphNode(int v) {
			vertex = v;
			link = null;
		}
	}
	
	private ArrayList<GraphNode> head;
	private int vertexCount;
	
	public AdjList(){
		head = new ArrayList<GraphNode>();
		vertexCount = 0;
	}
	
	public void insertVertex(int v){
		head.add(new GraphNode(v));
		vertexCount++;
	}
	
	public void insertEdge(int source, int destination){
		GraphNode gNode = new GraphNode(destination);
		gNode.link = head.get(source).link;
		head.get(source).link = gNode;
	}
	
	public void printAdjList(){
		for(int i=0; i<vertexCount; i++){
			System.out.printf("\n정점 %d의 인접리스트 : ", i);
			GraphNode gNode = head.get(i);
			while(gNode != null){
				System.out.printf("-> %d", gNode.vertex);
				gNode = gNode.link;
			}
		}
	}
	
}
