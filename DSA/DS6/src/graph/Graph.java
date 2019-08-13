package graph;

import java.util.List;

/**
 * @author Priya Pandey
 *
 */
public interface Graph {
	
	/**
	 * @return true or false if the graph is connected graph or not
	 */
	public boolean isConnected();
	
	/**
	 * @param nodes
	 * @return if nodes are reachable or not.
	 */
	public List<Integer> reachable(int vertex);
	
	/**
	 * Gives list Of edges of minimum spanning tree of a graph
	 * @return returns minimum spanning tree.
	 */
	public List<Edge> mst();
	
	/**
	 * Finds shortest path to reach from one vertex to another in graph
     * @param source 
     * @param destination
     * @return returns list of nodes containing shortest path
	 */
	public List<Integer> getShortestPath(int source, int destination);
}
