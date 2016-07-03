package graph;
public class GraphTest {

	public static void main(String[] args) {
		AdjMatrix graphMatrix = new AdjMatrix(3);
		graphMatrix.insertEdge(0, 1);
		graphMatrix.insertEdge(0, 2);
		graphMatrix.printMatrix();
		
		graphMatrix.removeEdge(0, 1);
		graphMatrix.printMatrix();
		
		AdjList graphList = new AdjList();
		for(int i=0; i<3; i++){
			graphList.insertVertex(i);
		}
		graphList.insertEdge(0, 1);
		graphList.insertEdge(0, 2);
		graphList.printAdjList();
	}

}
