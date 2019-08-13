package dictionary;

import java.util.*;

/**
 * IDictionary represents interface for Dictionary.
 *
 */
public interface IDictionary {
    
    /**
     * Add a node in dictionary.
     * @param key
     * @param value
     * @return returns node that is added in dictionary.
     */
    public void addNode(int key, String value);
    
    /**
     * Deletes a node from dictionary if it exists in dictionary.
     * @param key
     * @return returns true if node is deleted otherwise false.
     */
    public void deleteNode(int key);
    
    /**
     * Find the value corresponding to key in dictionary.
     * @param key
     * @return returns value for key if it exists in dictionary otherwise false.
     */
    public String getValue(int key);
    
    /**
     * Sort all values according to their key in dictionary.
     * @return returns sorted list.
     */
    public List<Node> getSortedList();
    
    /**
     * Sort all values whose keys lies in the range of key1 and key2 (both inclusive).
     * @param key1
     * @param key2
     * @return returns sorted list.
     */
    public List<Node> getSortedListInRangeOfKey(int key1,int key2);
}