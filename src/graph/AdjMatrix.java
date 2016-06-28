//인접행렬로 그래프 구현 
public class AdjMatrix {	
	private int matrix[][];
	private int vertexCount;
	
	public AdjMatrix(int vertexCount) {
		this.matrix = new int[vertexCount][vertexCount];
		this.vertexCount = vertexCount;
	}
	
	//정점 추가하기 
	public void insertVertex(int v){
		vertexCount++;
	}
	
	//간선 추가하기 
	public void insertEdge(int source, int destination){
		matrix[source][destination] = 1; //1이 아니라 가중치로 줄 경우 가중치 그래프를 표현할 수 있다. 
		matrix[destination][source] = 1; //무방향 그래프이므로 양쪽 다 표시 
	}
	
	public void removeEdge(int source, int destination){
		matrix[source][destination] = 0;
		matrix[destination][source] = 0;
	}
	
	public void printMatrix(){
		for(int i=0; i<vertexCount; i++){
			System.out.printf("\n\t\t");
			for(int j=0; j<vertexCount; j++){
				System.out.printf("%2d", matrix[i][j]);
			}
		}
	}
}
