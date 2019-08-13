package graph;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class GraphImplementationTest {

    GraphImplementation graph;

    //Test cases for isConnected()
    @Test
    public void testisConnectedShouldReturnTrueWhenGraphConnected() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 5, 2);
        boolean isConnected=graph.isConnected();
        assertEquals(true,isConnected);
    }
    
    @Test
    public void testisConnectedShouldReturnFalseWhenGraphNotConnected() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        boolean isConnected=graph.isConnected();
        assertEquals(false,isConnected);
    }
    
    //Test cases for reachable()
    @Test
    public void testgetReachableNodeShouldReturnListOfReachableNodeWhenAllNodesAreReachable() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 5, 2);
        List<Integer> actualOutput=graph.reachable(1);
        Collections.sort(actualOutput);
        int[] expectedOutput= {1,2,3,4,5};
        for(int i=0;i<expectedOutput.length;i++)
        {
            assertEquals(expectedOutput[i],(int)actualOutput.get(i));
        }
    }
    
    @Test
    public void testgetReachableNodeShouldReturnListOfReachableNodeWhenSomeNodesAreReachable() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        List<Integer> actualOutput=graph.reachable(1);
        Collections.sort(actualOutput);
        int[] expectedOutput= {1,2,4,5};
        for(int i=0;i<expectedOutput.length;i++)
        {
            assertEquals(expectedOutput[i],(int)actualOutput.get(i));
        }
    }
    
    @Test(expected=AssertionError.class)
    public void testgetReachableNodeShouldThrowExceptionWhenNodeNotExist() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.reachable(6);
        
    }
    
    //Test cases for mst()
    @Test
    public void testgetMSTShouldReturnListOfEdgesInMST() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 5, 2);
        List<Edge> actualOutput=graph.mst();
        for(Edge edge:actualOutput)
        {
            System.out.println(edge.getFirstNode()+" "+edge.getSecondNode()+" "+edge.getWeight());
        }
    }
    
    //Test cases for getShortestPath()
    @Test
    public void testgetShortestPathShouldReturnShortestPath() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.addEdge(3, 5, 2);
        List<Integer> actualOutput=graph.getShortestPath(1, 4);
        int[] expectedOutput= {1,2,4};
        for(int i=0;i<expectedOutput.length;i++)
        {
            assertEquals(expectedOutput[i],(int)actualOutput.get(i));
        }
    }
    
    @Test(expected=AssertionError.class)
    public void testgetShortestPathShouldThrowExceptionWhenNodeNotExist() {
        graph=new GraphImplementation(5);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(2, 5, 5);
        graph.reachable(6);
        
    }
}